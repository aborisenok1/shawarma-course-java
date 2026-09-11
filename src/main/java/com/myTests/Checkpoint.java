package com.myTests;

public class Checkpoint {
    public static void main(String[] args) {
        String dish = "SHAWARMA_XL";
        String kitchenAction;
        int qty = 2;
        int minutesToClose = 1;
        int discountPercent;
        int total;
        int subtotal;


        int unitPrice = switch (dish) {
            case "SHAWARMA_CLASSIC" -> 220;
            case "SHAWARMA_XL" -> 320;
            case "FALAFEL" -> 180;
            case "DRINK" -> 90;
            default -> 0;
        };

        subtotal = unitPrice * qty;

        if (subtotal >= 2000) {
            discountPercent = 15;
        } else if (subtotal >= 1000) {
            discountPercent = 10;
        } else if (subtotal >= 500) {
            discountPercent = 5;
        } else {
            discountPercent = 0;
        }

        total = subtotal - subtotal * discountPercent / 100;


        String batch = qty <= 1 ? "single"
                : (qty <= 5 ? "small batch" : "big batch");

        if (minutesToClose <= 0) {
            System.out.println("kitchen closed - reject");
        }

        if (minutesToClose <= 0) {
            kitchenAction = "kitchen closed - reject";
        } else {
            kitchenAction = switch (dish) {
                case "SHAWARMA_CLASSIC" -> "grill 4 min";
                case "SHAWARMA_XL" -> "grill 7 min";
                case "FALAFEL" -> "fry 5 min";
                case "DRINK" -> "pour & serve";
                default -> "manual check";
            };

            System.out.println("[ORDER]   " + dish + " x" + qty);
            System.out.println("[PRICE]   " + subtotal + " -> " + total + " (-" + discountPercent + "%)");
            System.out.println("[BATCH]   " + batch);
            System.out.println("[KITCHEN] " + kitchenAction);
            System.out.println("[CLOSE]   " + minutesToClose + " min left");
        }
    }
}
