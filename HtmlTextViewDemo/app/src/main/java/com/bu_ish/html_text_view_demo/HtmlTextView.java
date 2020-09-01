package com.bu_ish.html_text_view_demo;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/**
 * 用于便捷加载html的TextView<br>
 * 若html中包含a链接，则点击后默认用浏览器打开
 */
public class HtmlTextView extends AppCompatTextView {
    public HtmlTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 加载html
     *
     * @param html 给定的html字符串
     */
    public void loadHtml(@Nullable String html) {
        setText(Html.fromHtml(html));
        setMovementMethod(LinkMovementMethod.getInstance());
    }
}
