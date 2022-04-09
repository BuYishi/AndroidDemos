package com.coolor.view_binding_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.coolor.view_binding_demo.databinding.ActivityViewBindingBindBinding;

public class ViewBindingBindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_binding_bind);
        ActivityViewBindingBindBinding binding =
                ActivityViewBindingBindBinding.bind(findViewById(R.id.tvRoot));
        binding.tvRoot.setOnClickListener(v ->
                Toast.makeText(this, "Clicked root view", Toast.LENGTH_SHORT).show());
    }

    static void start(Context context) {
        context.startActivity(new Intent(context, ViewBindingBindActivity.class));
    }
}