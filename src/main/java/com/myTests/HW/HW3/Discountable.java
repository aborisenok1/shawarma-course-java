package com.myTests.HW.HW3;

public interface Discountable {
    int discountPercent();

    default int applyDiscount(int amount) {
        return amount - amount * discountPercent() / 100;
    }
}
