package com.mf.strategy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mf.strategy.ShoppingCart;
import com.mf.strategy.impl.PremiumStrategy;
import com.mf.strategy.impl.RegularStrategy;
import com.mf.strategy.impl.SaleStrategy;

public class StrategyPatternTest {
    @Test
    void testRegularStrategy() {
        ShoppingCart cart = new ShoppingCart();
        cart.setDiscountStrategy(new RegularStrategy());

        double totalPrice = 100.0;
        double discountedPrice = cart.calculateTotalPrice(totalPrice);

        // Assert that no discount is applied for regular customers
        assertEquals(totalPrice, discountedPrice);
    }

    @Test
    void testPremiumStrategy() {
        ShoppingCart cart = new ShoppingCart();
        cart.setDiscountStrategy(new PremiumStrategy());

        double totalPrice = 100.0;
        double discountedPrice = cart.calculateTotalPrice(totalPrice);

        // Assert that 10% discount is applied for premium customers
        assertEquals(90.0, discountedPrice);
    }

    @Test
    void testSaleStrategy() {
        ShoppingCart cart = new ShoppingCart();
        cart.setDiscountStrategy(new SaleStrategy());

        double totalPrice = 100.0;
        double discountedPrice = cart.calculateTotalPrice(totalPrice);

        // Assert that 20% discount is applied during a sale
        assertEquals(80.0, discountedPrice);
    }
}


