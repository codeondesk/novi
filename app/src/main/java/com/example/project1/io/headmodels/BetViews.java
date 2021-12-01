package com.example.project1.io.headmodels;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class BetViews {
    private String startTime;
    private String competitor1Caption;
    private String competitor2Caption;
    private int betContextId;
    private int marketViewGroupId;
    private int marketViewId;
    private int rootMarketViewGroupId;
    private String path;
    private List<Object> marketTags;
    private List<BetItem> betItems;
    private LiveData liveData;
    private String displayFormat;
    private String text;
    private String url;
    private int imageId;
    private String betViewKey;
    private String modelType;
    private String title;


    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getCompetitor1Caption() {
        return competitor1Caption;
    }
    public void setCompetitor1Caption(String competitor1Caption) { this.competitor1Caption = competitor1Caption; }
    public String getCompetitor2Caption() {
        return competitor2Caption;
    }
    public void setCompetitor2Caption(String competitor2Caption) { this.competitor2Caption = competitor2Caption; }

    public int getBetContextId() {
        return betContextId;
    }

    public void setBetContextId(int betContextId) {
        this.betContextId = betContextId;
    }

    public int getMarketViewGroupId() {
        return marketViewGroupId;
    }

    public void setMarketViewGroupId(int marketViewGroupId) {
        this.marketViewGroupId = marketViewGroupId;
    }

    public int getMarketViewId() {
        return marketViewId;
    }

    public void setMarketViewId(int marketViewId) {
        this.marketViewId = marketViewId;
    }

    public int getRootMarketViewGroupId() {
        return rootMarketViewGroupId;
    }

    public void setRootMarketViewGroupId(int rootMarketViewGroupId) {
        this.rootMarketViewGroupId = rootMarketViewGroupId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Object> getMarketTags() {
        return marketTags;
    }

    public void setMarketTags(List<Object> marketTags) {
        this.marketTags = marketTags;
    }

    public List<BetItem> getBetItems() {
        return betItems;
    }

    public void setBetItems(List<BetItem> betItems) {
        this.betItems = betItems;
    }

    public LiveData getLiveData() {
        return liveData;
    }

    public void setLiveData(LiveData liveData) {
        this.liveData = liveData;
    }

    public String getDisplayFormat() {
        return displayFormat;
    }

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
