package com.enums;

public enum PaymentChoice {
    CARD("VISA", true),
    CASH("InHouse", false),
    CRYPTO("Binance", true);

    private final String provider;
    private final boolean online;

    public String getProvider() {
        return provider;
    }

    public boolean isOnline() {
        return online;
    }

    PaymentChoice(String provider, boolean online) {
        this.provider = provider;
        this.online = online;
    }
}
