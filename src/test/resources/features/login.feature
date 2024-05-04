Feature: Login functionality

  Background: 
    Given User navigate to login page

  Scenario: Login with Valid credentials
    When User enter valid Email address "krshouvik@gmail.com" in the Email field
    And User enter valid Passowrd "Skar@1999" in the Password field
    And User clicks on Login Button
    Then User is able to login

  Scenario: Login with Invalid credentials
    When User enter invalid Email address "krsh@123" in the Email field
    And User enter invalid Passowrd "Skar@19" in the Password field
    And User clicks on Login Button
    Then User verify Warning message "Warning: No match for E-Mail Address and/or Password."

  Scenario: Login with Valid Email and Invalid Password
    When User enter valid Email address "krshouvik@gmail.com" in the Email field
    And User enter invalid Passowrd "Skar@19" in the Password field
    And User clicks on Login Button
    Then User verify Warning message "Warning: No match for E-Mail Address and/or Password."
