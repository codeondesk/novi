package com.example.project1.io.gamemodels;

import com.google.gson.annotations.SerializedName;

public class Event{
    @SerializedName("additionalCaptions")
    private AdditionalCaptions additionalCaptions;
    @SerializedName("liveData")
    private LiveData liveData;

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
}