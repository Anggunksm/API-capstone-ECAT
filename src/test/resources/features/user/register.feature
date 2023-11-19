Feature: Register
  As a user
  I want to register
  So that i can create an account

  Scenario: As a user I can register with valid credentials
    Given I set valid API endpoint for register
    When I send valid request for register
    And I set valid json data for register
    Then I receive status code 200
    And I successfully created account

  Scenario:




