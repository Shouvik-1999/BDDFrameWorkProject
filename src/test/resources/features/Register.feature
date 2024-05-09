Feature: Registration Functionality

  Background: 
    Given User navigate to register page
	
  @register_TC1
  Scenario: User create an account only with mandatory fields
    When User enter the details into fields
      | firstname        | Shouvik              |
      | lastname         | Kar                  |
      | telephone        |           1234567890 |
      | passowrd         |                12345 |
      | confirm passowrd |                12345 |
    And User select Privacy Policy
    And User clicks on Continue Button
    Then User Account is Successfully created
