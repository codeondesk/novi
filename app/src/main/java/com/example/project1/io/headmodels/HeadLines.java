package com.example.project1.io.headmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class HeadLines {

    @SerializedName("betViews")
    private List<BetViews> betViews;

    public List<BetViews> getBetViews() {
        return betViews;
    }

    public void setBetViews(List<BetViews> betViews) {
        this.betViews = betViews;
    }

}
