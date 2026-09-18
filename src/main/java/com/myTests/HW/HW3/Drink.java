package com.myTests.HW.HW3;

public class Drink extends MenuItem {
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

    Drink(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    @Override
    int price() {
        return basePrice;
    }

    @Override
    String kind() {
        return "Напиток";
    }
}
