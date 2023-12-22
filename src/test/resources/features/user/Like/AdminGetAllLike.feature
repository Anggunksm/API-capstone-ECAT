@admingetlike
Feature: Admin Get All Like
  As an admin
  I want to get all like
  So that I can get all like

  Scenario: As an admin I can get all like with valid credentials
    Given I set valid Api Endpoint for admin get all like
    When I send valid request and valid token for admin get all like
    Then I receive status code 200
    And Admin can get all like

  Scenario: As an admin I cannot get all like with invalid Api Endpoint
    Given I set invalid Api Endpoint for admin get all like
    When I send valid request and valid token for admin get all like 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot get all like with invalid request method
    Given I set valid Api Endpoint for admin get all like
    When I send invalid request and valid token for admin get all like
    Then I receive status code 404
    And I receive error message

  Scenario: As an admin I cannot get all like with invalid token
    Given I set valid Api Endpoint for admin get all like
    When I send valid request and invalid token for admin get all like
    Then I receive status code 401
    And I receive auth error message

  Scenario: As an admin I cannot get all like with invalid credentials
    Given I set invalid Api Endpoint for admin get all like
    When I send invalid request and invalid token for admin get all like
    Then I receive status code 404
    And I receive auth error message