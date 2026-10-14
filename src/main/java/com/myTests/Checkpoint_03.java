package com.myTests;


//Контрольная: меню закусочной
//После модулей «ООП основы» и «Наследование».

import java.util.*;

public class Checkpoint_03 {

    //Общий абстрактный класс ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public abstract class MenuItem {
        protected String name;
        protected int basePrice;

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

    //Общий интерфейс ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public interface Discountable {
        int discountPercent();

        default int applyDiscount(int amount) {
            return amount - amount * discountPercent() / 100;
        }
    }

    //Наследуемые классы ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    class Shawarma extends MenuItem {
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

        Shawarma(String name, int basePrice) {
            super(name, basePrice);
        }

        public Shawarma(String name, int basePrice, boolean xl) {
            super(name, basePrice);
            this.xl = xl;
        }

        @Override
        int price() {
            if (xl = true) {
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

    class Drink extends MenuItem {
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
            super(name, basePrice);
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

    class Combo extends MenuItem implements Discountable {
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
            super(name, basePrice);
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

//    public static void main(String[] args) {
//        //Shawarma classic = new Shawarma("Классическая", 250, false);
//        Shawarma classic = new Shawarma();
//        Shawarma xl = new Shawarma("XL", 250, true);
//
//        Drink cola = new Drink("Кола", 90);
//
//        Combo combo = new Combo("Шаурма + Кола", 320);
//    }
}