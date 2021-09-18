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
Feature: Buy Now
  I want to use this template for my feature file

  Scenario: user click button buy now 
    Given navigate into demo midtrans 
    When click button buy now 
    Then system direct to page buy now form 
        
   Scenario: user go to payment list form 
    When choose credit card payment method ten rupiah
    Then system direct to credit card form ten rupiah
    And check discount checkbox ten rupiah
    And uncheck discount checkbox ten percent
    And user click button paynow ten rupiah
    
 	 Scenario: user go to pay now form ten rupiah
    Then user fill otp number for discount ten rupiah
    And user choose button ok ten rupiah
    
  

 