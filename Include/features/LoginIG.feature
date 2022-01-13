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
@WebTwt
Feature: Login

  Rule: User can't login to their Instagram account

  @Login
  Scenario Outline: Invalid login
    Given User access Instagram page  
    When User fill <username> valid username
    And User fill <password> with invalid password
    And User click Login ig button
    Then User failed to login
    And User close browser

    Examples: 
      | username 					| password 		|
      | mitha@gmail.com 	| mitha123@ 	|