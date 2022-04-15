package com.coolor.gif_demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.coolor.gif_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = ActivityMainBinding.bind(findViewById(R.id.llRoot));
        binding.btnGifTextViewDemo.setOnClickListener(v ->
                GifTextViewDemoActivity.start(this));
        binding.btnGifImageViewDemo.setOnClickListener(v ->
                GifImageViewDemoActivity.start(this));
    }
}