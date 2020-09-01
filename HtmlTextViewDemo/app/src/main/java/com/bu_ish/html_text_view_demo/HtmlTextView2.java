package com.bu_ish.html_text_view_demo;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.SoundEffectConstants;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class HtmlTextView2 extends AppCompatTextView {
    private OnLinkClickListener onLinkClickListener;

    public HtmlTextView2(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void loadHtml(String html, OnLinkClickListener listener) {
        setHighlightColor(getResources().getColor(android.R.color.transparent));
        setMovementMethod(LinkMovementMethod.getInstance());
        setText(createSpannableStringBuilder(html));
        onLinkClickListener = listener;
    }

    private SpannableStringBuilder createSpannableStringBuilder(String source) {
        Spanned spanned = Html.fromHtml(source);
        SpannableStringBuilder builder = new SpannableStringBuilder(spanned);
        builder.clearSpans();
        URLSpan[] spans = spanned.getSpans(0, spanned.length(), URLSpan.class);
        for (URLSpan span : spans) {
            final String url = span.getURL();
            builder.setSpan(new ClickableSpan() {
                private long lastClickedTime;

                @Override
                public void updateDrawState(@NonNull TextPaint ds) {
                    ds.setColor(getResources().getColor(android.R.color.holo_blue_dark));
                    ds.setUnderlineText(false);
                }

                @Override
                public void onClick(@NonNull View widget) {
                    long currentTime = System.currentTimeMillis();
                    if (currentTime - lastClickedTime > 500) {
                        widget.playSoundEffect(SoundEffectConstants.CLICK);
                        if (onLinkClickListener != null) {
                            onLinkClickListener.onLinkClicked(url);
                        }
                    }
                    lastClickedTime = currentTime;
                }
            }, spanned.getSpanStart(span), spanned.getSpanEnd(span), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return builder;
    }

    public interface OnLinkClickListener {
        void onLinkClicked(String url);
    }
}
