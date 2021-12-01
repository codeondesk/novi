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




    public class BetItem{
        public int id;
        public String code;
        public String caption;
        public Object instanceCaption;
        public double price;
        public String oddsText;
        public boolean isAvailable;
    }

    public class QuarterScore{
        public String caption;
        public int homeScore;
        public int awayScore;
    }

    public class LiveData{
        public String remaining;
        public double remainingSeconds;
        public int homePoints;
        public int awayPoints;
        public List<QuarterScore> quarterScores;
        public boolean homePossession;
        public boolean supportsAchievements;
        public String liveStreamingCountries;
        public int sportradarMatchId;
        public Date referenceTime;
        public int referenceTimeUnix;
        public String elapsed;
        public double elapsedSeconds;
        public String duration;
        public double durationSeconds;
        public Object timeToNextPhase;
        public Object timeToNextPhaseSeconds;
        public String phaseSysname;
        public String phaseCaption;
        public String phaseCaptionLong;
        public boolean isLive;
        public boolean isInPlay;
        public boolean isInPlayPaused;
        public boolean isInterrupted;
        public boolean supportsActions;
        public Object timeline;
        public int adjustTimeMillis;
    }










}
