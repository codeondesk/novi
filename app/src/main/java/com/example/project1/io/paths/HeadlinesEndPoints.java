package com.example.project1.io.paths;

import com.example.project1.io.headmodels.HeadLines;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface HeadlinesEndPoints {
        @GET("/v2/5d711461330000d135779748")
        Call<List<HeadLines>> getBetViews(@Header("Authorization") String authToken);





    //@GET("/v2/5d711461330000d135779748")
    //Call<List<HeadLines>> getBetViews();



    }


