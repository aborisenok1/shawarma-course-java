package com.myTests.HW.HW3;


public class CheckPoint3 {
    public static void main(String[] args) {
        Shawarma classic = new Shawarma("Классическая", 250, false);
        classic.printReceipt();

        Shawarma xl = new Shawarma("XL", 250, true);
        xl.printReceipt();

        Drink cola = new Drink("Кола", 90);
        cola.printReceipt();

        Combo combo = new Combo("Шаурма + Кола", 320);
        combo.printReceipt();
        System.out.println(
                "[СКИДКА] "
                        + combo.discountPercent()
                        + "% → "
                        + combo.applyDiscount(combo.price())
                        + " руб"
        );
    }
}
