@Comment
Feature: Create Comment
  As a user
  I want to create comment
  So that I can create comment

  Scenario: As a user I can create comment with valid credentials
    Given I set valid API Endpoint for user create comment
    When I send valid request and set valid json data for user create comment
    And I send valid token for user create comment
    Then I receive code 201
    And User successfully create comment

  Scenario: As a user I cannot create comment with invalid API Endpoint
    Given I set invalid Api Endpoint for user create comment
    When I send valid request and set valid json data for user create comment 1
    And I send valid token for user create comment
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user i cannot create comment with invalid request
    Given I set valid API Endpoint for user create comment
    When I send invalid request and set valid json data for user create comment
    And I send valid token for user create comment
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user i cannot create comment with invalid json data
    Given I set valid API Endpoint for user create comment
    When I send valid request and set invalid json data for user create comment
    And I send valid token for user create comment
    Then I receive code 400
    And I receive auth error message1

  Scenario: As a user i cannot create comment with invalid token
    Given I set valid API Endpoint for user create comment
    When I send valid request and set valid json data for user create comment
    And I send invalid token for user create comment
    Then I receive code 401
    And I receive auth error message1

  Scenario: As a user i cannot create comment with invalid credentials
    Given I set invalid Api Endpoint for user create comment
    When I send invalid request and set invalid json data for user create comment
    And I send invalid token for user create comment
    Then I receive code 404
    And I receive auth error message1