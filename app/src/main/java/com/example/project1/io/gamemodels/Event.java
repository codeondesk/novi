package com.example.project1.io.gamemodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event{
    @SerializedName("additionalCaptions")
    private AdditionalCaptions additionalCaptions;
    @SerializedName("liveData")
    private LiveData liveData;
    private int betContextId;
    private String path;
    private boolean isHighlighted;
    private List<Market> markets;
    private boolean hasBetContextInfo;

    public AdditionalCaptions getAdditionalCaptions() {
        return additionalCaptions;
    }

    public void setAdditionalCaptions(AdditionalCaptions additionalCaptions) {
        this.additionalCaptions = additionalCaptions;
    }

    public LiveData getLiveData() {
        return liveData;
    }

    public void setLiveData(LiveData liveData) {
        this.liveData = liveData;
    }

    public int getBetContextId() {
        return betContextId;
    }

    public void setBetContextId(int betContextId) {
        this.betContextId = betContextId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }

    public void setHighlighted(boolean highlighted) {
        isHighlighted = highlighted;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public boolean isHasBetContextInfo() {
        return hasBetContextInfo;
    }

    public void setHasBetContextInfo(boolean hasBetContextInfo) {
        this.hasBetContextInfo = hasBetContextInfo;
    }
}