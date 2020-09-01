package com.bu_ish.staggered_grid_demo.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bu_ish.staggered_grid_demo.model.Image;
import com.bu_ish.staggered_grid_demo.R;
import com.bu_ish.staggered_grid_demo.databinding.ItemImageBinding;
import com.bumptech.glide.Glide;

import java.util.List;

public class ImageRecyclerViewAdapter extends RecyclerView.Adapter<ImageRecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<Image> imageList;

    public ImageRecyclerViewAdapter(Context context, List<Image> images) {
        this.context = context;
        imageList = images;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemImageBinding.inflate(LayoutInflater.from(context), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String url = imageList.get(position).getUrl();
        Glide.with(context).load(url).placeholder(R.mipmap.ic_launcher).into(holder.binding.getRoot());
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, url, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ItemImageBinding binding;

        public ViewHolder(@NonNull ItemImageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
