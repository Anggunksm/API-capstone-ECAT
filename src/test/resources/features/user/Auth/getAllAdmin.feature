@Admin
Feature: Get All Admin
  As an admin
  I want to get all admin
  So that I can get all admin

  Scenario: As an admin I can get all admin with valid credentials
    Given I set valid Api Endpoint for get all admin
    When I send valid request and valid token for get all admin
    Then I receive status code 200
    And I can get all data admin

  Scenario: As an admin I cannot get all admin with invalid Api Endpoint
    Given I set invalid Api Endpoint for get all admin
    When I send valid request and valid token for get all admin 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot get all admin with invalid request method
    Given I set valid Api Endpoint for get all admin
    When I send invalid request and valid token for get all admin
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot get all admin with invalid token
    Given I set valid Api Endpoint for get all admin
    When I send valid request and invalid token for get all admin
    Then I receive status code 401
    And I receive auth error message

  Scenario: As an admin I cannot get all admin with invalid credentials
    Given I set invalid Api Endpoint for get all admin
    When I send invalid request and invalid token for get all admin
    Then I receive status code 404
    And I receive auth error message


