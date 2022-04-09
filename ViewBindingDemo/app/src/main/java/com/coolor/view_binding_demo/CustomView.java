package com.coolor.view_binding_demo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.coolor.view_binding_demo.databinding.ViewCustomBinding;

@SuppressLint("SetTextI18n")
public class CustomView extends LinearLayout {
    private final ViewCustomBinding binding;

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        binding = ViewCustomBinding.inflate(LayoutInflater.from(context), this);
        initUI();
        setupUIListeners();
    }

    private void initUI() {
        setBackgroundColor(Color.WHITE);
        setOrientation(VERTICAL);
        binding.tvLabel.setText("This is a TextView");
    }

    private void setupUIListeners() {
        binding.tvButton.setOnClickListener(v -> binding.tvLabel.setText("ViewBinding Usage in CustomView"));
    }

    public void updateUI(String text) {
        binding.tvLabel.setText(text);
    }
}
