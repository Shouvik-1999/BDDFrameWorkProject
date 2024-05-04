Feature: Registration Functionality

  Background: 
    Given User navigate to register page

  Scenario: User create an account only with mandatory fields
    When User enter the details into fields
      | firstname | Shouvik              |
      | lastname  | Kar                  |
      | email     | shouvik123@gmail.com |
      | telephone |           1234567890 |
      | passowrd  |                12345 |
    And User select Privacy Policy
    And User clicks on Continue Button
    Then User Account is Successfully created
