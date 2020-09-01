package com.bu_ish.html_text_view_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bu_ish.html_text_view_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnDemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.htvDemo1.loadHtml("一个强大的NES游戏模拟器<a href=\"http://www.mesen.ca/\">Mesen</a>");
            }
        });
        binding.btnDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String html="一个强大的NES游戏模拟器<a href=\"http://www.mesen.ca/\">Mesen</a><br><a href=\"https://pan.baidu.com/s/1MUlCqlGoqv1-9N3ukaOHJg\">百度网盘分享链接</a>";
                binding.htv2Demo2.loadHtml(html, new HtmlTextView2.OnLinkClickListener() {
                    @Override
                    public void onLinkClicked(String url) {
                        Toast.makeText(view.getContext(),url,Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}