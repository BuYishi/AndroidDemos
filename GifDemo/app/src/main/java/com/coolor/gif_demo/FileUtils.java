package com.coolor.gif_demo;

import android.content.Context;

import androidx.annotation.Nullable;

import java.io.BufferedInputStream;
import java.io.IOException;

public class FileUtils {
    @Nullable
    public static String readAssetFileAsString(Context context, String filename) {
        try (BufferedInputStream bis = new BufferedInputStream(context.getAssets().open(filename))) {
            byte[] buffer = new byte[bis.available()];
            //noinspection ResultOfMethodCallIgnored
            bis.read(buffer);
            return new String(buffer);
        } catch (IOException ex) {
            return null;
        }
    }
}
