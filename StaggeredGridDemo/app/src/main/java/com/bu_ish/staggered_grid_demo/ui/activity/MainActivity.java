package com.bu_ish.staggered_grid_demo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.bu_ish.staggered_grid_demo.R;
import com.bu_ish.staggered_grid_demo.ui.activity.Demo1Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDemo1Clicked(View view) {
        Demo1Activity.start(this);
    }

    public void onDemo2Clicked(View view) {
        Demo2Activity.start(this);
    }
}