Feature: Strategy Design Pattern

Scenario: Calculate the discount
	Given a shopping cart
	And a customer with a specific strategy
	When I calculate the discount
	Then the discount should be applied according to the strategy
	
	
	



	