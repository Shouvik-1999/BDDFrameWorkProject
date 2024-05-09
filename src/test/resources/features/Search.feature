Feature: Search functionality

Background:
Given User opens the application

Scenario: User searches for a valida product
When User enters valid product "HP" into searchbox field
And User clicks search Button
Then User should get valid product displayed

Scenario: User searches for an Invalid product
When User enters valid product "HP" into searchbox field
And User clicks search Button
Then User validate no product matching message

