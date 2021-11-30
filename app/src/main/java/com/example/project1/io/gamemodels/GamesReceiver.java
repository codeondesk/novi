package com.example.project1.io.gamemodels;

import com.example.project1.io.gamemodels.BetView;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GamesReceiver {
    @SerializedName("betViews")
    private List<BetView> betViews;

    public List<BetView> getBetViews() {
        return betViews;
    }

    public void setBetViews(List<BetView> betViews) {
        this.betViews = betViews;
    }
}
