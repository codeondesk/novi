package com.example.project1.io.gamemodels;

import com.google.gson.annotations.SerializedName;

public class AdditionalCaptions{
    @SerializedName("competitor1")
    private String competitor1;
    @SerializedName("competitor2")
    private String competitor2;

    public String getCompetitor1() {
        return competitor1;
    }

    public void setCompetitor1(String competitor1) {
        this.competitor1 = competitor1;
    }

    public String getCompetitor2() {
        return competitor2;
    }

    public void setCompetitor2(String competitor2) {
        this.competitor2 = competitor2;
    }
}