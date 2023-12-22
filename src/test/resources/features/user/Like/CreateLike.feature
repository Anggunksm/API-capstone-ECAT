@LikeUser
Feature: Create Like
  As a user
  I want to create like
  So that I can like a post

  Scenario: As a user I can create like with valid credentials
    Given I set valid API Endpoint for create like
    When I send valid request and set valid json data for create like
    And I send valid token for create like
    Then I receive code 201
    And I successfully create like

  Scenario: As a user I cannot create like with invalid API Endpoint
    Given I set invalid Api Endpoint for create like
    When I send valid request and set valid json data for create like 1
    And I send valid token for create like
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user i cannot create like with invalid request
    Given I set valid API Endpoint for create like
    When I send invalid request and set valid json data for create like
    And I send valid token for create like
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user i cannot create like with invalid json data
    Given I set valid API Endpoint for create like
    When I send valid request and set invalid json data for create like
    And I send valid token for create like
    Then I receive code 500
    And I receive auth error message1

  Scenario: As a user i cannot create like with invalid token
    Given I set valid API Endpoint for create like
    When I send valid request and set valid json data for create like
    And I send invalid token for create like
    Then I receive code 401
    And I receive auth error message1

  Scenario: As a user i cannot create like with invalid credentials
    Given I set invalid Api Endpoint for create like
    When I send invalid request and set invalid json data for create like
    And I send invalid token for create like
    Then I receive code 404
    And I receive auth error message1