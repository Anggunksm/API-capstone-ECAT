@Login
Feature: Login
  As a  user
  I want to login
  So that i can logged in

  Scenario: AS a user i can login with valid credentials
    Given I set valid Api Endpoint for login
    When I send valid request and send valid json data for login
    Then I receive status code 200
    And I successfully sign in

  Scenario: AS a user i cannot login with invalid Api Endpoint
    Given I set invalid Api Endpoint for login
    When I send valid request and send valid json data for login 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: AS a user i cannot login with invalid request method
    Given I set valid Api Endpoint for login
    When I send invalid request and send valid json data for login
    Then I receive status code 401
    And I receive auth error message

  Scenario: AS a user i cannot login with invalid username
    Given I set valid Api Endpoint for login
    When I send valid request and send invalid username at json data for login
    Then I receive status code 400
    And I receive error message

  Scenario: AS a user i cannot login with invalid password
    Given I set valid Api Endpoint for login
    When I send valid request and send invalid password at json data for login
    Then I receive status code 400
    And I receive error message

  Scenario: AS a user i cannot login with invalid json data
    Given I set valid Api Endpoint for login
    When I send valid request and send invalid json data for login
    Then I receive status code 400
    And I receive error message

  Scenario: AS a user i cannot login with invalid credentials
    Given I set invalid Api Endpoint for login
    When I send invalid request and send invalid json data for login
    Then I receive status code 404
    And I receive auth error message





