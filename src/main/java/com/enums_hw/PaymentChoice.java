package com.enums_hw;

public enum PaymentChoice {
    CARD(true),
    CASH(false),
    SBP(true);

    PaymentChoice(boolean online) {
        this.online = online;
    }

    public boolean isOnline() {
        return online;
    }

    private final boolean online;
}