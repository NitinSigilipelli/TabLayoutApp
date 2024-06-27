package com.example.tablayoutapp.service;

import com.example.tablayoutapp.model.ImageResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("sfw/waifu")
    Call<ImageResponse> getWaifuImage();

    @GET("sfw/neko")
    Call<ImageResponse> getNekoImage();

    @GET("sfw/shinobu")
    Call<ImageResponse> getShinobuImage();


}