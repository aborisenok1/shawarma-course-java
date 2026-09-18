package com.myTests.HW.HW3;

public abstract class MenuItem {
    protected String name;
    protected int basePrice;

    public MenuItem() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    MenuItem(String name, int basePrice) {
    }

    void printReceipt() {
        System.out.println("[" + kind() + "] " + name + " — " + price() + " руб");
    }

    abstract int price();

    abstract String kind();
}
