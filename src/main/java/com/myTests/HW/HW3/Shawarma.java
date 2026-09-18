package com.myTests.HW.HW3;

public class Shawarma extends MenuItem {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public void setBasePrice(int basePrice) {
        super.setBasePrice(basePrice);
    }

    public Shawarma(String name, int basePrice, boolean xl) {
        //super(name, basePrice);
        this.name = name;
        this.basePrice = basePrice;
        this.xl = xl;
    }

    @Override
    int price() {
        if (xl == true) {
            return basePrice + 100;
        }
        return basePrice;
    }

    @Override
    String kind() {
        return "Шаурма";
    }

    private boolean xl;
}
