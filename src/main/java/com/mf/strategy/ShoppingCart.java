package com.mf.strategy;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotalPrice(double totalPrice) {
        if (discountStrategy != null) {
            return discountStrategy.applyDiscount(totalPrice);
        }
        return totalPrice;
    }
}

