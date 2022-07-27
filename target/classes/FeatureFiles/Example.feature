@regression @smoke @SKYW-15 @E2E
Feature: Test Background Feature

Description: The purpose of this feature is to test the Background keyword

Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 

Scenario: Search a product and add the first product to the User basket
	Given User search for Lenovo Laptop
	When Add the first laptop that appears in the search result to the basket
	Then User basket should display with added item

Scenario: Navigate to a product and add the same to the User basket
	Given User navigate for Lenovo Laptop
	When Add the laptop to the basket
	Then User basket should display with added item
	
Scenario: Search for Shoes
	Given Open Ebay Homepage
	When Search for shoes
	Then Item list should have only shoes related products	
	
Scenario Outline: Search for items with Brands
	Given Open Ebay Homepage
	When Search for "<Items>"
	And Filter by "<Brand>"
	Then Item list should have products of "<Brand>"
		
	Examples:
		|Items		|Brand		|
		|Shoes		|Nike		|
		|Shirts		|Adidas		|
		|Pants		|Unbranded	|