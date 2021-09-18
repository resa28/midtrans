#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Buy Now Denied Payment
  I want to use this template for my feature file

  @tag1
   Scenario: user click feature button buy now
    Given navigate go to demo midtrans
    When click button buy now
    Then system direct to page buy now form
    And user click button checkout
    And user click button continue
        
   Scenario: user fill cc with decline card
    Given choose credit card payment method
    When system direct to credit card form
    And user fill cc form
    And user click button paynow
    And user choose button ok
    Then system display error message