package com.bu_ish.floating_window_demo;

import android.content.Context;
import android.graphics.PixelFormat;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class FloatingWindow {
    private View view;
    private int width, height;
    private WindowManager.LayoutParams layoutParams;

    FloatingWindow(View view, int width, int height) {
        this.view = view;
        this.width = width;
        this.height = height;
        setOnTouchListener();
    }

    void show() {
        show(Gravity.TOP | Gravity.END);
    }

    void show(int gravity) {
        layoutParams = newLayoutParams(width, height, gravity);
        getWindowManager().addView(view, layoutParams);
    }

    void close() {
        getWindowManager().removeViewImmediate(view);
    }

    private void setOnTouchListener() {
        view.setOnTouchListener(new View.OnTouchListener() {
            private float x, y;
            private boolean shouldPerformClick;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        x = event.getRawX();
                        y = event.getRawY();
                        shouldPerformClick = true;
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        float xCurrent = event.getRawX(), yCurrent = event.getRawY();
                        float xMoved = xCurrent - x, yMoved = yCurrent - y;
                        shouldPerformClick = xMoved == 0 && yMoved == 0;
                        x = xCurrent;
                        y = yCurrent;
                        layoutParams.x += xMoved;
                        layoutParams.y += yMoved;
                        getWindowManager().updateViewLayout(view, layoutParams);
                        return true;
                    case MotionEvent.ACTION_UP:
                        if (shouldPerformClick) {
                            view.performClick();
                            return false;
                        }
                        return true;
                }
                return false;
            }
        });
    }

    private WindowManager getWindowManager() {
        return (WindowManager) view.getContext().getSystemService(Context.WINDOW_SERVICE);
    }

    private WindowManager.LayoutParams newLayoutParams(int width, int height, int gravity) {
        WindowManager.LayoutParams params = new WindowManager.LayoutParams();
        params.width = width;
        params.height = height;
        params.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;  //make the navigation back button clickable
        params.format = PixelFormat.RGBA_8888;  //make the floating window background transparent
        params.gravity = gravity;
        return params;
    }
}
