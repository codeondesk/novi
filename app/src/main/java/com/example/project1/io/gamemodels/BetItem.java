package com.example.project1.io.gamemodels;

public class BetItem {
    private int id;
    private String code;
    private String caption;
    private String instanceCaption;
    private double price;
    private String oddsText;
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getInstanceCaption() {
        return instanceCaption;
    }

    public void setInstanceCaption(String instanceCaption) {
        this.instanceCaption = instanceCaption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOddsText() {
        return oddsText;
    }

    public void setOddsText(String oddsText) {
        this.oddsText = oddsText;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
