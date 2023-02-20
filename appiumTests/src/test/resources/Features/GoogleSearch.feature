Feature: Feature to test google search functionality

@WebTest
  Scenario: Validate google search functionality
    Given Browser is open
    And User is on google search page
    When User enters a text in search box
    And Hits Enter
    Then User is navigated to the search results page

    
    