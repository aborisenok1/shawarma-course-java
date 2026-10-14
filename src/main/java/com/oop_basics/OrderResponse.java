package com.oop_basics;

public class OrderResponse {
    private int id;
    private String status;
    private double price;
    private int receptId;

    public OrderResponse(int id, String status, double price, int receptId) {
        this.id = id;
        this.status = status;
        this.price = price;
        this.receptId = receptId;
    }

    public OrderResponse() {
//        System.out.println("Аварийное завершение из-за конструктора :)");
//        System.exit(1);
        this.id = 0;
        this.status = "NEW";
        this.price = 100;
        this.receptId = 1;
    }

    public void summary() {
        System.out.println(status + id + price + receptId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReceptId() {
        return receptId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public void addDiscount(int percent) {
        boolean isValid = validateDiscount(percent);
        if (!isValid) {
            System.out.println("Скидка не применилась " + percent);
        }

        this.price = this.price + percent;
        System.out.println("Скидка применилась " + percent);
    }

    private boolean validateDiscount(int percent) {
        if (percent < 0) {
            return false;
        }

        if (percent > 100) {
            return false;
        }

        return true;
    }
}
