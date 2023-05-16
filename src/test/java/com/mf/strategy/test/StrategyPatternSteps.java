package com.mf.strategy.test;

import org.junit.runner.RunWith;

import com.mf.strategy.ShoppingCart;
import com.mf.strategy.impl.PremiumStrategy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class StrategyPatternSteps {
	private ShoppingCart shoppingCart;
	private PremiumStrategy premiumStrategy; 

	@Given("I have a shopping cart")
	@And("I have a customer with a specific strategy")
	public void i_have_a_shoppingCart_and_a_specific_strategy() {
		shoppingCart = new ShoppingCart();
		premiumStrategy = new PremiumStrategy();
	}

	@When("Calculate the discount")
	public void calculate_the_discount() {

	}
	
	@Then("Then the discount should be applied according to the strategy")
	public void all_weather_displays_should_be_updated() {

	}
	  
}