package com.coolor.gif_demo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import androidx.annotation.FloatRange;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class GifImageViewX extends GifImageView {
    public GifImageViewX(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setSpeed(@FloatRange(from = 0, fromInclusive = false) float factor) {
        Drawable drawable = getDrawable();
        if (drawable instanceof GifDrawable) {
            ((GifDrawable) drawable).setSpeed(factor);
        }
    }
}
