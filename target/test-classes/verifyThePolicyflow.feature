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
Feature: policy flow
 

  @tag1
  Scenario: provide all credencials
    Given POS login in the vizza portal 
    When fill and get quote
    And select the care plan
    When verify the CKYC
    And fill the all mandatory field in proposer page
    And fill the insured page
    Then enter the nominee details
    And proposal created


