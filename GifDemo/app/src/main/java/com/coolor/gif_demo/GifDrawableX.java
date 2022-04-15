package com.coolor.gif_demo;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;

public class GifDrawableX extends GifDrawable {
    private final Callback callback;

    public GifDrawableX(@NonNull AssetManager assets, @NonNull String assetName, Callback callback) throws IOException {
        super(assets, assetName);
        setCallback(callback);
        this.callback = callback;
    }

    static class Callback implements Drawable.Callback {
        private final View view;

        Callback(View view) {
            this.view = view;
        }

        @Override
        public void invalidateDrawable(@NonNull Drawable who) {
            view.invalidate();
        }

        @Override
        public void scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when) {
            view.postDelayed(what, when);
        }

        @Override
        public void unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what) {
            view.removeCallbacks(what);
        }
    }
}
