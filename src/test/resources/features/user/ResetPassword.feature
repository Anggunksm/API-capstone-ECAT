@User
Feature: Reset Password
  As a user
  I want to reset password
  So that i can change my password

  Scenario: As a user I can reset password with valid credentials
    Given I set valid API endpoint for reset password
    When I send valid request and set valid json data for reset password
    And I send valid token for reset password
    Then I receive code 201
    And I Successfully change password

  Scenario: As a user I cannot reset password with invalid API Endpoint
    Given I set invalid API endpoint for reset password
    When I send valid request and set valid json data for reset password 1
    And I send valid token for reset password
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot reset password with invalid request method
    Given I set valid API endpoint for reset password
    When I send invalid request and set valid json data for reset password
    And I send valid token for reset password
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot reset password with invalid token
    Given I set valid API endpoint for reset password
    When I send valid request and set valid json data for reset password
    And I send invalid token for reset password
    Then I receive code 401
    And I receive auth error message1

  Scenario: As a user I cannot reset password with invalid json data
    Given I set valid API endpoint for reset password
    When I send valid request and set invalid json data for reset password
    And I send valid token for reset password
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot reset password with invalid request credentials
    Given I set invalid API endpoint for reset password
    When I send invalid request and set invalid json data for reset password
    And I send invalid token for reset password
    Then I receive code 404
    And I receive auth error message1









