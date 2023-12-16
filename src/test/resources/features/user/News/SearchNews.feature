@Admin
Feature: Search News
  As an admin
  I want to search news
  So that I can search news

  Scenario: As an admin I can search news with valid credentials
    Given I set valid Api Endpoint for search news
    When I send valid request and valid token for search news
    Then I receive status code 200
    And I can search news

  Scenario: As an admin I cannot search news with invalid Api Endpoint
    Given I set invalid Api Endpoint for search news
    When I send valid request and valid token for search news 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot search news with invalid request method
    Given I set valid Api Endpoint for search news
    When I send invalid request and valid token for search news
    Then I receive status code 404
    And I receive error message

  Scenario: As an admin I cannot search news with invalid token
    Given I set valid Api Endpoint for search news
    When I send valid request and invalid token for search news
    Then I receive status code 401
    And I receive auth error message

  Scenario: As an admin I cannot search news with invalid credentials
    Given I set invalid Api Endpoint for search news
    When I send invalid request and invalid token for search news
    Then I receive status code 404
    And I receive auth error message


