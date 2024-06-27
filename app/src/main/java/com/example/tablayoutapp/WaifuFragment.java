package com.example.tablayoutapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tablayoutapp.model.ImageResponse;
import com.example.tablayoutapp.service.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WaifuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WaifuFragment extends Fragment {
    ImageView imageView;
    Button refreshButton;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WaifuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CallsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WaifuFragment newInstance(String param1, String param2) {
        WaifuFragment fragment = new WaifuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_neko, container, false);
        imageView = view.findViewById(R.id.imageView);
        refreshButton = view.findViewById(R.id.refreshButton);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadImage();
            }
        });

        loadImage();
        return view;
    }
    private void loadImage() {
        Call<ImageResponse> call = ApiClient.getApiService().getWaifuImage();
        call.enqueue(new Callback<ImageResponse>() {

            @Override
            public void onResponse(Call<ImageResponse> call, Response<ImageResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    String imageUrl = response.body().getImageUrl();
                    Glide.with(WaifuFragment.this).load(imageUrl).into(imageView);
                } else {
                    Log.e("WaifuFragment", "Failed to load image: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<ImageResponse> call, Throwable t) {
                Log.e("WaifuFragment", "onFailure: " + t.getMessage());
            }
        });
    }
}