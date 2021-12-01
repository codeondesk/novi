package com.example.project1.io.gamemodels;

import com.example.project1.io.gamemodels.BetView;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GamesReceiver {
    @SerializedName("betViews")
    private List<BetView> betViews;
    private String caption;
    private String marketViewType;
    private String marketViewKey;
    private String modelType;
    private boolean hasHighlights;
    private int totalCount;

    public List<BetView> getBetViews() {

        return betViews;
    }
    public void setBetViews(List<BetView> betViews) {

        this.betViews = betViews;
    }
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getMarketViewType() {
        return marketViewType;
    }

    public void setMarketViewType(String marketViewType) {
        this.marketViewType = marketViewType;
    }

    public String getMarketViewKey() {
        return marketViewKey;
    }

    public void setMarketViewKey(String marketViewKey) {
        this.marketViewKey = marketViewKey;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public boolean isHasHighlights() {
        return hasHighlights;
    }

    public void setHasHighlights(boolean hasHighlights) {
        this.hasHighlights = hasHighlights;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
