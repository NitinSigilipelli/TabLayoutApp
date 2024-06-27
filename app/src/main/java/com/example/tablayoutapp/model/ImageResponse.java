package com.example.tablayoutapp.model;

import com.google.gson.annotations.SerializedName;

public class ImageResponse {
    @SerializedName("url")
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
