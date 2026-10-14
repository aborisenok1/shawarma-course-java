package com.enums_hw;

import static com.enums_hw.OrderValidator.validateAndPrice;

public class Checkpoint {
    public static void main(String[] args) {

//        RecipeSize size = RecipeSize.L;
//        int price = size.getBasePrice();
//        System.out.println(price);

        // 1 — recipeId = 0  → ошибка
        runCase(0L, RecipeSize.M, 2, PaymentChoice.CARD);

        // 2 — size = null   → ошибка
        runCase(42L, null, 2, PaymentChoice.CARD);

        // 3 — qty = 15      → ошибка
        runCase(42L, RecipeSize.L, 15, PaymentChoice.CARD);

        // 4 — payment = null → ошибка
        runCase(42L, RecipeSize.L, 2, null);

        // 5 — payment = CASH → ошибка
        runCase(42L, RecipeSize.L, 5, PaymentChoice.CASH);

        // 6 — всё корректно  → успех
        runCase(42L, RecipeSize.L, 2, PaymentChoice.CARD);

    }

    private static void runCase(
            long recipeId,
            RecipeSize size,
            int qty,
            PaymentChoice payment
    ) {
        try {
            int price = validateAndPrice(recipeId, size, qty, payment);
            System.out.println("[OK] price=" + price);
        } catch (OrderValidationException e) {
            System.out.println("[REJECT] " + e.getMessage());
        }
    }
}