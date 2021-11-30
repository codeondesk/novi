package com.example.project1.io.gamemodels;


import com.google.gson.annotations.SerializedName;

public class LiveData{
    @SerializedName("elapsed")
    private String elapsed;

    public String getElapsed() {
        return elapsed;
    }

    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }
}