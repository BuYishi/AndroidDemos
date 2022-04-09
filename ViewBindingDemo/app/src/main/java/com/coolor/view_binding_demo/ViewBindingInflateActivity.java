package com.coolor.view_binding_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.coolor.view_binding_demo.databinding.ActivityViewBindingInflateBinding;

public class ViewBindingInflateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ActivityViewBindingInflateBinding.inflate(getLayoutInflater()).getRoot());
    }

    static void start(Context context) {
        context.startActivity(new Intent(context, ViewBindingInflateActivity.class));
    }
}