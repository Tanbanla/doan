package com.example.doan.API;

import com.example.doan.Object.ThongBao;
import com.example.doan.Object.ThongBao1Item;
import com.example.doan.Object.ThongBaoItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/Notifications")
    Call<List<ThongBaoItem>> getThongBao();
}
