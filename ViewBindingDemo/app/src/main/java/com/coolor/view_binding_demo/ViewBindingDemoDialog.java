package com.coolor.view_binding_demo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

import com.coolor.view_binding_demo.databinding.DialogViewBindingDemoBinding;

import java.util.Objects;

public class ViewBindingDemoDialog extends Dialog {
    public ViewBindingDemoDialog(@NonNull Context context) {
        super(context, R.style.DialogTheme);
        setCancelable(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_view_binding_demo);
        DialogViewBindingDemoBinding binding =
                DialogViewBindingDemoBinding.bind(findViewById(R.id.llRoot));
        binding.btnOK.setOnClickListener(v -> dismiss());
    }

    @Override
    public void show() {
        super.show();
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = Objects.requireNonNull(window).getAttributes();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        window.setAttributes(layoutParams);
    }
}
