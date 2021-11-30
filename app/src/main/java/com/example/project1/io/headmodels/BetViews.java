package com.example.project1.io.headmodels;

import com.google.gson.annotations.SerializedName;

public class BetViews {
    @SerializedName("startTime")
    private String startTime;
    @SerializedName("competitor1Caption")
    private String competitor1Caption;
    @SerializedName("competitor2Caption")
    private String competitor2Caption;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCompetitor1Caption() {
        return competitor1Caption;
    }

    public void setCompetitor1Caption(String competitor1Caption) {
        this.competitor1Caption = competitor1Caption;
    }

    public String getCompetitor2Caption() {
        return competitor2Caption;
    }

    public void setCompetitor2Caption(String competitor2Caption) {
        this.competitor2Caption = competitor2Caption;
    }
}
