

 
Feature: Searching Item

I want to use this template for my feature file

 
 
Scenario: Search headphone
    Given Enters the Username "lalitha"
    And Enters the password "password123"
    When clicks the login button
    Then It Displays the next page
   Given User must be in the home page
   When User search a product in a search box "Head"
   And Click the Find Details button
   Then Navigated to the product details page
