package com.mf.strategy.impl;

import com.mf.strategy.DiscountStrategy;

public class SaleStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.8; // 20% discount during a sale
    }
}