package com.bu_ish.tip_toast_demo;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Toast;

import com.bu_ish.tip_toast_demo.databinding.TipToastBinding;

public class TipToast {
    private static Toast lastToast;

    public static void show(CharSequence text) {
        if (lastToast != null) {
            lastToast.cancel();
        }
        Toast toast = newToast(text);
        toast.show();
        lastToast = toast;
    }

    private static Toast newToast(CharSequence text) {
        DemoApplication context = DemoApplication.getInstance();
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        TipToastBinding binding = TipToastBinding.inflate(LayoutInflater.from(context));
        binding.getRoot().setText(text);
        toast.setView(binding.getRoot());
        return toast;
    }
}
