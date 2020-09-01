package com.bu_ish.staggered_grid_demo.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bu_ish.staggered_grid_demo.R;
import com.bu_ish.staggered_grid_demo.databinding.ItemImage2Binding;
import com.bu_ish.staggered_grid_demo.model.Image;
import com.bumptech.glide.Glide;

import java.util.List;

public class ImageRecyclerViewAdapter2 extends RecyclerView.Adapter<ImageRecyclerViewAdapter2.ViewHolder> {
    private Context context;
    private List<Image> ImageList;

    public ImageRecyclerViewAdapter2(Context context, List<Image> Images) {
        this.context = context;
        ImageList = Images;
    }

    @NonNull
    @Override
    public ImageRecyclerViewAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ImageRecyclerViewAdapter2.ViewHolder(ItemImage2Binding.inflate(LayoutInflater.from(context), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ImageRecyclerViewAdapter2.ViewHolder holder, final int position) {
        final String url = ImageList.get(position).getUrl();
        Glide.with(context).load(url).placeholder(R.mipmap.ic_launcher).into(holder.binding.getRoot());
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, position + "\n" + url, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return ImageList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ItemImage2Binding binding;

        public ViewHolder(@NonNull ItemImage2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
