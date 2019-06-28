

Feature: Login
  

  
  Scenario Outline: User login
    Given Enter the Username "<username>"
    And enter the password "<password>"
    When click the login button
    Then It displays the next page
    

    Examples: 
      | username   | password       | 
      | lalitha    |     password123 | 
       
