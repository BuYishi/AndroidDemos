package com.coolor.gif_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.coolor.gif_demo.databinding.ActivityGifImageViewDemoBinding;

public class GifImageViewDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_image_view_demo);
        ActivityGifImageViewDemoBinding binding =
                ActivityGifImageViewDemoBinding.bind(findViewById(R.id.llRoot));
        binding.btnHalfSpeed.setOnClickListener(v -> binding.givBeauty.setSpeed(0.5f));
        binding.btnNormalSpeed.setOnClickListener(v -> binding.givBeauty.setSpeed(1));
        binding.btnDoubleSpeed.setOnClickListener(v -> binding.givBeauty.setSpeed(2));
    }

    static void start(Context context) {
        context.startActivity(new Intent(context, GifImageViewDemoActivity.class));
    }
}