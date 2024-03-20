package com.example.doan.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;

import com.example.doan.R;
import com.example.doan.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initiLocation();
    }

    private void initiLocation() {
        String video ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NZ03vaNSCLI?si=gY1ayyuY7spD8KyO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
            binding.Video.loadData(video, "text/html","utf-8");
            binding.Video.getSettings().setJavaScriptEnabled(true);
            binding.Video.setWebChromeClient(new WebChromeClient());
    }
}