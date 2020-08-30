package com.bu_ish.tip_toast_demo;

import android.app.Application;

import androidx.annotation.NonNull;

public class DemoApplication extends Application {
    private static DemoApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    @NonNull
    public static DemoApplication getInstance() {
        return instance;
    }
}
