package com.coolor.view_binding_demo;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnActivity, btnFragment, btnDialog, btnCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupUIListeners();
    }

    private void findViews() {
        btnActivity = findViewById(R.id.btnActivity);
        btnFragment = findViewById(R.id.btnFragment);
        btnDialog = findViewById(R.id.btnDialog);
        btnCustomView = findViewById(R.id.btnCustomView);
    }

    private void setupUIListeners() {
        btnActivity.setOnClickListener(v -> ViewBindingDemoActivity.start(this));
        btnFragment.setOnClickListener(v -> ViewBindingDemoFragmentActivity.start(this));
        btnDialog.setOnClickListener(v -> new ViewBindingDemoDialog(this).show());
        btnCustomView.setOnClickListener(v -> CustomViewActivity.start(this));
    }
}