package com.example.project1.io.gamemodels;

import java.util.List;
import java.util.Objects;

public class Market {
    private int marketId;
    private String betTypeSysname;
    private List<BetItem> betItems;

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public String getBetTypeSysname() {
        return betTypeSysname;
    }

    public void setBetTypeSysname(String betTypeSysname) {
        this.betTypeSysname = betTypeSysname;
    }

    public List<BetItem> getBetItems() {
        return betItems;
    }

    public void setBetItems(List<BetItem> betItems) {
        this.betItems = betItems;
    }
}

