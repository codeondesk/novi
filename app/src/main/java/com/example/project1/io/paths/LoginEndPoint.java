package com.example.project1.io.paths;

import com.example.project1.io.Login;
import com.example.project1.io.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface LoginEndPoint {

    @POST("/login")
    Call <User> login(@Body Login login);

}
