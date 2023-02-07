#Author: Ajith Ashokkumar
 
Feature: Validate Calculator
   
  @tag1
  Scenario: Calculator Validation
    Given I Open the calculator application
    When I do some operation
    Then I validate the results
    
 
  @tag2
  Scenario: Calculator Validation II
    Given I Open the calculator application again
    When I do some operation again
    Then I validate the results again