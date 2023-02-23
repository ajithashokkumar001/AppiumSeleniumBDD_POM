#Author: Ajith Ashokkumar
Feature: Validate Gene App



  @MobileMultipleTestsGene
  Scenario Outline: Gene App Validation Multiple Tests
    Given I Open the Gene App
    When I do some operation Gene
    Then I validate the results

    