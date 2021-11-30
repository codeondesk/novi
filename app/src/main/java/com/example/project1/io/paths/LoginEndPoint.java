package com.example.project1.io.paths;
import com.example.project1.io.Login;
import com.example.project1.io.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface LoginEndPoint {

    @POST("/login")
    Call <User> login(@Body Login login);

}
