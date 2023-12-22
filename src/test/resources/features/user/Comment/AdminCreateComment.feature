@Comment
Feature: Admin Create Comment
  As an admin
  I want to create comment
  So that I can create comment

  Scenario: As an admin I can create comment with valid credentials
    Given I set valid API Endpoint for create comment
    When I send valid request and set valid json data for create comment
    And I send valid token for create comment
    Then I receive code 201
    And I successfully create comment

  Scenario: As an admin I cannot create comment with invalid API Endpoint
    Given I set invalid Api Endpoint for create comment
    When I send valid request and set valid json data for create comment 1
    And I send valid token for create comment
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin i cannot create comment with invalid request
    Given I set valid API Endpoint for create comment
    When I send invalid request and set valid json data for create comment
    And I send valid token for create comment
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin i cannot create comment with invalid json data
    Given I set valid API Endpoint for create comment
    When I send valid request and set invalid json data for create comment
    And I send valid token for create comment
    Then I receive code 400
    And I receive auth error message1

  Scenario: As an admin i cannot create comment with invalid token
    Given I set valid API Endpoint for create comment
    When I send valid request and set valid json data for create comment
    And I send invalid token for create comment
    Then I receive code 401
    And I receive auth error message1

  Scenario: As an admin i cannot create comment with invalid credentials
    Given I set invalid Api Endpoint for create comment
    When I send invalid request and set invalid json data for create comment
    And I send invalid token for create comment
    Then I receive code 404
    And I receive auth error message1