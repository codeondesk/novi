package com.example.project1.io.gamemodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Competition{
    @SerializedName("events")
    private List<Event> events;
    private String caption;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
