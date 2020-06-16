package com.bu_ish.floating_window_demo;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bu_ish.floating_window_demo.databinding.ActivityMainBinding;
import com.bu_ish.floating_window_demo.databinding.FloatingWindowBeautyBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private FloatingWindow floatingWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        binding.btnShowCloseFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.btnShowCloseFloating.getText().equals(getText(R.string.show_floating_window))) {
                    if (floatingWindow == null) {
                        View windowView = FloatingWindowBeautyBinding.inflate(getLayoutInflater()).getRoot();
                        windowView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(v.getContext(), "轩子巨2兔", Toast.LENGTH_SHORT).show();
                            }
                        });
                        floatingWindow = new FloatingWindow(windowView, 300, 400);
                    }
                    floatingWindow.show(Gravity.CENTER);
                    binding.btnShowCloseFloating.setText(R.string.close_floating_window);
                } else {
                    floatingWindow.close();
                    binding.btnShowCloseFloating.setText(R.string.show_floating_window);
                }
            }
        });
    }
}