package com.coolor.view_binding_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.coolor.view_binding_demo.databinding.ActivityCustomViewBinding;

public class CustomViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCustomViewBinding binding = ActivityCustomViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnUpdate.setOnClickListener(v ->
                binding.customView.updateUI("CustomView.updateUI(String) called"));
    }

    static void start(Context context) {
        context.startActivity(new Intent(context, CustomViewActivity.class));
    }
}