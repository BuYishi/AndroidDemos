package com.bu_ish.staggered_grid_demo.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bu_ish.staggered_grid_demo.databinding.ActivityDemo2Binding;
import com.bu_ish.staggered_grid_demo.model.Image;
import com.bu_ish.staggered_grid_demo.ui.adapter.ImageRecyclerViewAdapter2;

import java.util.ArrayList;

public class Demo2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDemo2Binding binding = ActivityDemo2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvImage.setAdapter(new ImageRecyclerViewAdapter2(this, getImageList()));
    }

    private ArrayList<Image> getImageList() {
        ArrayList<Image> images = new ArrayList<>();
        images.add(new Image("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598949957848&di=49055b2f5aea86dc2883cb1ab78fa056&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F36%2F48%2F19300001357258133412489354717.jpg"));
        images.add(new Image("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598949967986&di=1c25bfa1af9c700f683fcf1a5d1bfeb6&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg"));
        images.add(new Image("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2202780618,895893289&fm=26&gp=0.jpg"));
        images.add(new Image("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598949976090&di=4db2bc846d3cfbb3620b5fd29c5a72cd&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F56%2F12%2F01300000164151121576126282411.jpg"));
        images.add(new Image("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598950034012&di=5a2798306d882ccb888301aad1372e32&imgtype=0&src=http%3A%2F%2Fa1.att.hudong.com%2F05%2F00%2F01300000194285122188000535877.jpg"));
        images.add(new Image("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3381573685,1866477444&fm=26&gp=0.jpg"));
        images.add(new Image("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3008142408,2229729459&fm=26&gp=0.jpg"));
        images.add(new Image("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598950055046&di=36ccd30755494af952d4937fc6479822&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F52%2F52%2F01200000169026136208529565374.jpg"));
        images.add(new Image("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1593106255,4245861836&fm=26&gp=0.jpg"));
        images.add(new Image("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598950072091&di=f5de45942c0fcb3ff0d60896a2550537&imgtype=0&src=http%3A%2F%2Fa1.att.hudong.com%2F14%2F46%2F14200000033870127493462324860.jpg"));
        images.add(new Image("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3429697988,3234939276&fm=26&gp=0.jpg"));
        images.add(new Image("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2572269671,1886327428&fm=26&gp=0.jpg"));
        images.add(new Image("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2572269671,1886327428&fm=26&gp=0.jpg"));
        images.add(new Image("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1645400555,522596956&fm=26&gp=0.jpg"));
        images.add(new Image("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3363295869,2467511306&fm=26&gp=0.jpg"));
        images.add(new Image("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=328389424,2589490932&fm=26&gp=0.jpg"));
        return images;
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, Demo2Activity.class));
    }
}
