package com.coolor.gif_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.coolor.gif_demo.databinding.ActivityGifTextViewDemoBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GifTextViewDemoActivity extends AppCompatActivity {
    private static final String TAG = GifTextViewDemoActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityGifTextViewDemoBinding binding =
                ActivityGifTextViewDemoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnShowEmojisText.setOnClickListener(v -> {
            try {
                Map<String, String> emojis = new Gson().fromJson(
                        FileUtils.readAssetFileAsString(this, "emojis/emojis.json"),
                        new TypeToken<Map<String, String>>() {
                        }.getType());
                SpannableStringBuilder builder = new SpannableStringBuilder(
                        "调皮[Naughty]抓狂[Mad]大笑[Laugh]爱慕[Adoring]尴尬[Embarrassed]" +
                                "可爱[Cute]大哭[Cry]再见[Bye]");
                String regex = "\\[(\\S+?)]";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(builder);
                while (m.find()) {
                    GifDrawableX drawable = new GifDrawableX(getAssets(),
                            "emojis/" + Objects.requireNonNull(emojis).get(m.group()),
                            new GifDrawableX.Callback(binding.gtvEmojisText));
                    drawable.setBounds(0, 0, 100, 100);
                    builder.setSpan(new ImageSpan(drawable), m.start(), m.end(), 0);
                }
                binding.gtvEmojisText.setText(builder);
            } catch (IOException e) {
                Log.e(TAG, null, e);
            }
        });
    }

    static void start(Context context) {
        context.startActivity(new Intent(context, GifTextViewDemoActivity.class));
    }
}