package com.bu_ish.staggered_grid_demo.ui.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.flexbox.FlexboxLayoutManager;

/**
 * 伸缩盒RecyclerView，用于实现流式布局
 */
public class FlexboxRecyclerView extends RecyclerView {
    public FlexboxRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setLayoutManager(new FlexboxLayoutManager(context));
    }
}
