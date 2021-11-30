package com.example.project1.io.gamemodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BetView{
    @SerializedName("competitions")
    private List<Competition> competitions;

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }
}
