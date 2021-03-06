package com.example.project1.io.gamemodels;


import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class LiveData{
    private String elapsed;
    private String remaining;
    private double remainingSeconds;
    private int homePoints;
    private int awayPoints;
    private Object quarterScores;
    private boolean homePossession;
    private boolean supportsAchievements;
    private String liveStreamingCountries;
    private int sportradarMatchId;
    private Date referenceTime;
    private int referenceTimeUnix;
    private double elapsedSeconds;
    private String duration;
    private int durationSeconds;
    private String timeToNextPhase;
    private double timeToNextPhaseSeconds;
    private String phaseSysname;
    private String phaseCaption;
    private String phaseCaptionLong;
    private boolean isLive;
    private boolean isInPlay;
    private boolean isInPlayPaused;
    private boolean isInterrupted;
    private boolean supportsActions;
    private Object timeline;
    private int adjustTimeMillis;

    public String getElapsed() {
        return elapsed;
    }

    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    public String getRemaining() {
        return remaining;
    }

    public void setRemaining(String remaining) {
        this.remaining = remaining;
    }

    public double getRemainingSeconds() {
        return remainingSeconds;
    }

    public void setRemainingSeconds(double remainingSeconds) {
        this.remainingSeconds = remainingSeconds;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public void setHomePoints(int homePoints) {
        this.homePoints = homePoints;
    }

    public int getAwayPoints() {
        return awayPoints;
    }

    public void setAwayPoints(int awayPoints) {
        this.awayPoints = awayPoints;
    }

    public Object getQuarterScores() {
        return quarterScores;
    }

    public void setQuarterScores(Object quarterScores) {
        this.quarterScores = quarterScores;
    }

    public boolean isHomePossession() {
        return homePossession;
    }

    public void setHomePossession(boolean homePossession) {
        this.homePossession = homePossession;
    }

    public boolean isSupportsAchievements() {
        return supportsAchievements;
    }

    public void setSupportsAchievements(boolean supportsAchievements) {
        this.supportsAchievements = supportsAchievements;
    }

    public String getLiveStreamingCountries() {
        return liveStreamingCountries;
    }

    public void setLiveStreamingCountries(String liveStreamingCountries) {
        this.liveStreamingCountries = liveStreamingCountries;
    }

    public int getSportradarMatchId() {
        return sportradarMatchId;
    }

    public void setSportradarMatchId(int sportradarMatchId) {
        this.sportradarMatchId = sportradarMatchId;
    }

    public Date getReferenceTime() {
        return referenceTime;
    }

    public void setReferenceTime(Date referenceTime) {
        this.referenceTime = referenceTime;
    }

    public int getReferenceTimeUnix() {
        return referenceTimeUnix;
    }

    public void setReferenceTimeUnix(int referenceTimeUnix) {
        this.referenceTimeUnix = referenceTimeUnix;
    }

    public double getElapsedSeconds() {
        return elapsedSeconds;
    }

    public void setElapsedSeconds(double elapsedSeconds) {
        this.elapsedSeconds = elapsedSeconds;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public String getTimeToNextPhase() {
        return timeToNextPhase;
    }

    public void setTimeToNextPhase(String timeToNextPhase) {
        this.timeToNextPhase = timeToNextPhase;
    }

    public double getTimeToNextPhaseSeconds() {
        return timeToNextPhaseSeconds;
    }

    public void setTimeToNextPhaseSeconds(double timeToNextPhaseSeconds) {
        this.timeToNextPhaseSeconds = timeToNextPhaseSeconds;
    }

    public String getPhaseSysname() {
        return phaseSysname;
    }

    public void setPhaseSysname(String phaseSysname) {
        this.phaseSysname = phaseSysname;
    }

    public String getPhaseCaption() {
        return phaseCaption;
    }

    public void setPhaseCaption(String phaseCaption) {
        this.phaseCaption = phaseCaption;
    }

    public String getPhaseCaptionLong() {
        return phaseCaptionLong;
    }

    public void setPhaseCaptionLong(String phaseCaptionLong) {
        this.phaseCaptionLong = phaseCaptionLong;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public boolean isInPlay() {
        return isInPlay;
    }

    public void setInPlay(boolean inPlay) {
        isInPlay = inPlay;
    }

    public boolean isInPlayPaused() {
        return isInPlayPaused;
    }

    public void setInPlayPaused(boolean inPlayPaused) {
        isInPlayPaused = inPlayPaused;
    }

    public boolean isInterrupted() {
        return isInterrupted;
    }

    public void setInterrupted(boolean interrupted) {
        isInterrupted = interrupted;
    }

    public boolean isSupportsActions() {
        return supportsActions;
    }

    public void setSupportsActions(boolean supportsActions) {
        this.supportsActions = supportsActions;
    }

    public Object getTimeline() {
        return timeline;
    }

    public void setTimeline(Object timeline) {
        this.timeline = timeline;
    }

    public int getAdjustTimeMillis() {
        return adjustTimeMillis;
    }

    public void setAdjustTimeMillis(int adjustTimeMillis) {
        this.adjustTimeMillis = adjustTimeMillis;
    }
}