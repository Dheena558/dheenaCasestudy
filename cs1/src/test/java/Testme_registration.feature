
Feature: Testme app registration
  
  Scenario: Registration Steps
    Given open the Testme app Home page
    And click the signup button
    And Enter the username "Dheena"
    And Enter the First name "Dheena"
    And Enter the Last name "dhayalan"
    And Enter the password "Dheena123"
    And Confirm the password "Dheena123"
    And select the gender 
    And Enter email id "abcd@gmail.com"
    And Enter the Mobile Number "9944957385"
    And Enter the date of birth "13/02/1997"
    And enter the Address "abc123 street"
    And Select the Security Question 
    And enter the Answer "chennai "
    When User click Register Button
    Then It redirects to login page and displays user registration successfull
    
    

 