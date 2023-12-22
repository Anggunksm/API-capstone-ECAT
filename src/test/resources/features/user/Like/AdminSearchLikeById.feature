@AdminLike
Feature: Admin Search Like
  As an admin
  I want to search like
  So that I can search like

  Scenario: As an admin I can search like with valid credentials
    Given I set valid Api Endpoint for admin search like
    When I send valid request and valid token for admin search like
    Then I receive status code 200
    And Admin can search like

  Scenario: As an admin I cannot search like with invalid Api Endpoint
    Given I set invalid Api Endpoint for admin search like
    When I send valid request and valid token for admin search like 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot search like with invalid request method
    Given I set valid Api Endpoint for admin search like
    When I send invalid request and valid token for admin search like
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot search like with invalid token
    Given I set valid Api Endpoint for admin search like
    When I send valid request and invalid token for admin search like
    Then I receive status code 401
    And I receive auth error message

  Scenario: As an admin I cannot search like with invalid credentials
    Given I set invalid Api Endpoint for admin search like
    When I send invalid request and invalid token for admin search like
    Then I receive status code 404
    And I receive auth error message