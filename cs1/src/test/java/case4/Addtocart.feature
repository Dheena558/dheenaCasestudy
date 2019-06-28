
@tag
Feature: Adding products to cart
  I want to use this template for my feature file

  @tag1
  Scenario: Add to cart
   Given  Username "lalitha"
    And  password "password123"
    When user clicks the login button
    Then Displays the next page
   Given user must be in the home page
   When user search a product in a search box "Head"
   And Click the Find Details Button
   Then Navigated to the product Details page
   And user checks for payment_error happens
    
    
    @tag2
    Scenario: payment
   Given user sign and find products 
   Given user click add to cart button
   And after verifying click cart button
   And  click checkout button
   And  for payment click payment Button
   And Select bank
   And click Continue button
   And  User enters the User Name
   And  User enters the password
   Then click login Button
   Then  enters the transaction password
   Then click pay button
   Then payment successfull
   