package com.mf.strategy.impl;

import com.mf.strategy.DiscountStrategy;

public class PremiumStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.9; // 10% discount for premium customers
    }
}
