package com.coolor.view_binding_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ViewBindingDemoActivity extends AppCompatActivity {
    private Button btnDemo1, btnDemo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_binding_demo);
        findViews();
        setupUIListeners();
    }

    private void findViews() {
        btnDemo1 = findViewById(R.id.btnDemo1);
        btnDemo2 = findViewById(R.id.btnDemo2);
    }

    private void setupUIListeners() {
        btnDemo1.setOnClickListener(v -> ViewBindingInflateActivity.start(this));
        btnDemo2.setOnClickListener(v -> ViewBindingBindActivity.start(this));
    }

    static void start(Context context) {
        context.startActivity(new Intent(context, ViewBindingDemoActivity.class));
    }
}