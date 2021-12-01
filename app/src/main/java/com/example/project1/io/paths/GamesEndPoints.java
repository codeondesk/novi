package com.example.project1.io.paths;

import com.example.project1.io.gamemodels.Event;
import com.example.project1.io.gamemodels.GamesReceiver;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface GamesEndPoints {
    @GET("/v2/5d7114b2330000112177974d")
    Call<List<GamesReceiver>> getGames(@Header("Authorization") String authToken);

}
