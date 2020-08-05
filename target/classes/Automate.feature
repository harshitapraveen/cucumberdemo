#Author: harshita praveen
Feature: Login functionality
  Test the login functionality of sdet university

  @login
  Scenario:  Test the login functionality of sdet university
    Given user navigates to the desired webpage 
    When user clicks on bestsellers
    Then the Bestsellers items should be displayed
    When user clicks on the required item
    And clicks on add to cart
    Then the item will be displayed in the cart
    
    
       
  @example
  Scenario Outline: Login functionality
  Given user navigates to the Pharmeasy website
  When user clicks on select pincode
  And User enter the pincode as "<Pincode>" and clicks on check
  Then user will be displayed with the medical products
  When user clicks on HealthCare products
  And clicks on Personal Care
  Then the Personal Care products will be displayed
  When clicked on sort and selects low to high
  Then the products should be displayed in a sorted manner
  When clicked on the required medicine and clicks adds it to cart
  And selects quantity and clicks on the cart
  Then the cart will be displayed with the added products
  

    Examples:
		 |Pincode        		      | 
		 |500010				      |
		#|500047                      |
		#|500012                      |
		
		
  @guru99
  Scenario: Learning website
  Given user navigates to the learning website
  When user clicks on Sap course
  
  
      
