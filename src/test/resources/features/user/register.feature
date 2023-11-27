@Register
Feature: Register
  As a user
  I want to register
  So that i can create an account

  Scenario: As a user I can register with valid credentials
    Given I set valid API endpoint for register
    When I send valid request and set valid json data for register
    Then I receive code 201
    And I Successfully Sign Up

  Scenario: As a user I cannot register with invalid email
    Given I set valid API endpoint for register
    When I send valid request and set json data with invalid email for register
    Then I receive code 400

  Scenario: As a user I cannot register with invalid endpoint
    Given I set invalid API endpoint for register
    When I send valid request and set valid json data for register
    Then I receive code 401

  Scenario: As a user I cannot register with invalid request
    Given I set valid API endpoint for register
    When I send invalid request and set valid json data for register
    Then I receive code 401

  Scenario: As a user I cannot register with invalid name
    Given I set valid API endpoint for register
    When I send valid request and set json data with invalid name for register
    Then I receive code 400

  Scenario: As a user I cannot register with invalid username
    Given I set valid API endpoint for register
    When I send valid request and set json data with invalid username for register
    Then I receive code 400

  Scenario: As a user I cannot register with empty email
    Given I set valid API endpoint for register
    When I send valid request and set json data with empty email for register
    Then I receive code 400

  Scenario: As a user I cannot register with invalid number phone
    Given I set valid API endpoint for register
    When I send valid request and set json data with invalid number phone for register
    Then I receive code 400

  Scenario: As a user I cannot register with invalid password
    Given I set valid API endpoint for register
    When I send valid request and set json data with invalid password for register
    Then I receive code 400

  Scenario: As a user I cannot register with invalid json data
    Given I set valid API endpoint for register
    When I send valid request and set invalid json data for register
    Then I receive code 400

  Scenario: As a user I cannot register with registered email
    Given I set valid API endpoint for register
    When I send valid request and set json data with registered email for register
    Then I receive code 409

  Scenario: As a user I cannot register with invalid credentials
    Given I set invalid API endpoint for register
    When I send invalid request and set invalid json data for register
    Then I receive code 401









