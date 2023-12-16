@Admin
Feature: Get All News
  As an admin
  I want to get all news
  So that I can get all news

  Scenario: As an admin I can get all news with valid credentials
    Given I set valid Api Endpoint for get all news
    When I send valid request and valid token for get all news
    Then I receive status code 200
    And I can get all news

  Scenario: As an admin I cannot get all news with invalid Api Endpoint
    Given I set invalid Api Endpoint for get all news
    When I send valid request and valid token for get all news 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot get all news with invalid request method
    Given I set valid Api Endpoint for get all news
    When I send invalid request and valid token for get all news
    Then I receive status code 404
    And I receive error message

  Scenario: As an admin I cannot get all news with invalid token
    Given I set valid Api Endpoint for get all news
    When I send valid request and invalid token for get all news
    Then I receive status code 401
    And I receive auth error message

  Scenario: As an admin I cannot get all news with invalid credentials
    Given I set invalid Api Endpoint for get all news
    When I send invalid request and invalid token for get all news
    Then I receive status code 404
    And I receive auth error message


