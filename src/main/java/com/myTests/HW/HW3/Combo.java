package com.myTests.HW.HW3;


public class Combo extends MenuItem implements Discountable {
    @Override
    public int discountPercent() {
        return 15;
    }

    @Override
    public int applyDiscount(int amount) {
        return Discountable.super.applyDiscount(amount);
    }

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

    Combo(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    @Override
    int price() {
        return basePrice;
    }

    @Override
    String kind() {
        return "Комбо";
    }
}
