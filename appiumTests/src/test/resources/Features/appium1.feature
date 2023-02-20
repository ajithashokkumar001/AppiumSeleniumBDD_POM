#Author: Ajith Ashokkumar
Feature: Validate Calculator

  @MobileTest
  Scenario: Calculator Validation
    Given I Open the calculator application
    When I do some operation
    Then I validate the results

  @MobileTestII
  Scenario: Calculator Validation II
    Given I Open the calculator application again
    When I do some operation again
    Then I validate the results again

  @MobileMultipleTests
  Scenario Outline: Calculator Validation Multiple Tests
    Given I Open the calculator application again
    When I do some operation again User enters <Num1> and <Num2>
    When I do some operation again
    Then I validate the results again

    Examples: 
      | Num1 | Num2 |
      |    5 |    6 |
      |    4 |    7 |
