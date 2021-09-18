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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: system display button sign up
    Given navigate to landing page demo midtrans
    When click button sign up
    Then system direct to page register
   
  Scenario: user diarahkan ke form registrasi 
  	When system direct to page register 
    Then verify all text page register
    
 #Scenario: user cant register with blank email and pasword
  #	Given display form register  
  #	Then system display error message email cant blank
#		And system display error message phone cant blank 
#		
#	Scenario: user cant register with blank password
  #	Given display form register  
  #	Then system display error message password cant blank
  	

   
   
 
   
  

    