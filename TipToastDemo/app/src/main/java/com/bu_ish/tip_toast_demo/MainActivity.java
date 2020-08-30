package com.bu_ish.tip_toast_demo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bu_ish.tip_toast_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnToast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TipToast.show("Something wrong!");
            }
        });
        binding.btnToast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TipToast.show("出了点错误！");
            }
        });
    }
}