package com.example.doan.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.Toast;

import com.example.doan.API.ApiClient;
import com.example.doan.Object.ThongBao;
import com.example.doan.Object.ThongBao1Item;
import com.example.doan.Object.ThongBaoItem;
import com.example.doan.R;
import com.example.doan.databinding.ActivityMainBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initiLocation();
       CallAPI();
        binding.imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "OK1", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initiLocation() {
        String video ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NZ03vaNSCLI?si=gY1ayyuY7spD8KyO\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
            binding.Video.loadData(video, "text/html","utf-8");
            binding.Video.getSettings().setJavaScriptEnabled(true);
            binding.Video.setWebChromeClient(new WebChromeClient());
    }
    private  void CallAPI(){
        Call<List<ThongBaoItem>> call = ApiClient.getInstance().getApi().getThongBao();
        call.enqueue(new Callback<List<ThongBaoItem>>() {
            @Override
            public void onResponse(Call<List<ThongBaoItem>> call, Response<List<ThongBaoItem>> response) {
                if(response.isSuccessful()){
                    List<ThongBaoItem> thongBaoItemList = response.body();
                    binding.name.setText(""+thongBaoItemList.get(0).getContent());
                    Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                    binding.imageView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            binding.name.setText(""+thongBaoItemList.get(0).getContent());
                            Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<List<ThongBaoItem>> call, Throwable t) {
                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                binding.search.setText(""+t.getMessage());
            }
        });
    }
}