@Admin
Feature: Create News
  As an admin
  I want to create news
  So that I can create news

  Scenario: As an admin I can create news with valid credentials
    Given I set valid API Endpoint for create news
    When I send valid request and set valid json data for create news
    And I send valid token for create news
    Then I receive code 201
    And I successfully create news

  Scenario: As an admin I cannot create news with invalid API Endpoint
    Given I set invalid Api Endpoint for create news
    When I send valid request and set valid json data for create news 1
    And I send valid token for create news
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin i cannot create news with invalid request
    Given I set valid API Endpoint for create news
    When I send invalid request and set valid json data for create news
    And I send valid token for create news
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin i cannot create news with invalid json data
    Given I set valid API Endpoint for create news
    When I send valid request and set invalid json data for create news
    And I send valid token for create news
    Then I receive code 400
    And I receive auth error message1

  Scenario: As an admin i cannot create news with invalid token
    Given I set valid API Endpoint for create news
    When I send valid request and set valid json data for create news
    And I send invalid token for create news
    Then I receive code 401
    And I receive auth error message1

  Scenario: As an admin i cannot create news with invalid credentials
    Given I set invalid Api Endpoint for create news
    When I send invalid request and set invalid json data for create news
    And I send invalid token for create news
    Then I receive code 404
    And I receive auth error message1
