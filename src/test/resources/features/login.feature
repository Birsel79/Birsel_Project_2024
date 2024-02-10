@milestone_1
Feature: Login Feature
  bu test login ozelligini test eder

  @milestone_1_1
  Scenario: Valid username - valid password
    Given User is on login page
    When User enters valid username
#   When User enters CodingBook  (for parametre)
#    When User enters:
#    |CodingBook|
#    |Birsel
    And User enters valid password
    And User clicks login button
    Then User should successfully login the system

  @milestone_1_2
  Scenario: Valid username - invalid password
    Given User is on login page
    When User enters valid username
#    When User enters Birsel  (for parametre)
    And User enters invalid password
    And User clicks login button
    Then User should successfully login the system




# @milestone_1_3
# Scenario Outline: Valid username - valid password
#   Given User is on login page
#   When User enters valid "<username>"
#   And User enters valid password
#   And User clicks login button
#   Then User should successfully login the system
#
#   Examples:
#   |username|
#   |birsel|
#   |ceylin|
#   |alp   |
