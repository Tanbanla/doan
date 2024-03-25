package com.example.doan.API;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static  ApiClient instance;
    private Retrofit retrofit;
    private  static  final  String BASEURL ="https://widesagelamp93.conveyor.cloud/";
    private  ApiClient(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }
    public static synchronized ApiClient getInstance(){
        if(instance == null){
            instance = new ApiClient();
        }
        return instance;
    }
    public ApiInterface getApi(){
        return  retrofit.create(ApiInterface.class);
    }
}
