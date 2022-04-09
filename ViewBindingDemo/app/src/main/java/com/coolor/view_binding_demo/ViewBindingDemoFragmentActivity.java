package com.coolor.view_binding_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ViewBindingDemoFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_binding_demo_fragment);
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentContainer,
                ViewBindingDemoFragment.getInstance()).commit();
    }

    static void start(Context context) {
        context.startActivity(new Intent(context, ViewBindingDemoFragmentActivity.class));
    }
}