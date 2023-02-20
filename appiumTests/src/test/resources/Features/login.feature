Feature: Feature to test login functionality

  @WebTest
  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When User enters Username and Password
    And Clicks on login button
    Then User is navigated to the Home Page

  @WebmultipleTests
  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enters <Username> and <Password>
    And Clicks on login button
    Then User is navigated to the Home Page

    Examples: 
      | Username | Password |
      | Ajith    |    12345 |
      | Aarya    |    12345 |
