package com.example.project1.io.gamemodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BetView{
    @SerializedName("competitions")
    private List<Competition> competitions;

    private String betViewKey;
    private String modelType;
    private String competitionContextCaption;
    private int totalCount;
    private List<MarketCaption> marketCaptions;


    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    public String getBetViewKey() {
        return betViewKey;
    }

    public void setBetViewKey(String betViewKey) {
        this.betViewKey = betViewKey;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getCompetitionContextCaption() {
        return competitionContextCaption;
    }

    public void setCompetitionContextCaption(String competitionContextCaption) {
        this.competitionContextCaption = competitionContextCaption;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<MarketCaption> getMarketCaptions() {
        return marketCaptions;
    }

    public void setMarketCaptions(List<MarketCaption> marketCaptions) {
        this.marketCaptions = marketCaptions;
    }
}
