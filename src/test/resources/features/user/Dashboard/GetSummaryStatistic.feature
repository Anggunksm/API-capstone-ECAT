Feature: Get Summary Statistics
  As an admin
  I want to get summary statistics
  So that I can get summary statistics

  Scenario: As an admin I can get summary statistics with valid credentials
    Given I set valid Api Endpoint for get summary statistics
    When I send valid request and valid token for get summary statistics
    Then I receive status code 200
    And I can get get summary statistics

  Scenario: As an admin I cannot get summary statistics with invalid Api Endpoint
    Given I set invalid Api Endpoint for get summary statistics
    When I send valid request and valid token for get summary statistics 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot get summary statistics with invalid request method
    Given I set valid Api Endpoint for get summary statistics
    When I send invalid request and valid token for get summary statistics
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot get summary statistics with invalid token
    Given I set valid Api Endpoint for get summary statistics
    When I send valid request and invalid token for get summary statistics
    Then I receive status code 401
    And I receive auth error message

  Scenario: As an admin I cannot get summary statistics with invalid credentials
    Given I set invalid Api Endpoint for get summary statistics
    When I send invalid request and invalid token for get summary statistics
    Then I receive status code 404
    And I receive auth error message


