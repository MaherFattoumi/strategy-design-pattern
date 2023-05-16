package com.mf.strategy.impl;

import com.mf.strategy.DiscountStrategy;

public class RegularStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice;
    }
}
