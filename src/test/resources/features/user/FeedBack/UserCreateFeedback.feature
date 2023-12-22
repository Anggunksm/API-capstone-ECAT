@UserFeedback
Feature: User Create Feedback
  As a user
  I want to create feedback
  So that I can create feedback

  Scenario: As a user I can create feedback with valid credentials
    Given I set valid API Endpoint for a user create feedback
    When I send valid request and set valid json data for a user create feedback
    And I send valid token for a user create feedback
    Then I receive code 201
    And User successfully create feedback

  Scenario: As a user I cannot create feedback with invalid API Endpoint
    Given I set invalid Api Endpoint for a user create feedback
    When I send valid request and set valid json data for a user create feedback 1
    And I send valid token for a user create feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user i cannot create feedback with invalid request
    Given I set valid API Endpoint for a user create feedback
    When I send invalid request and set valid json data for a user create feedback
    And I send valid token for a user create feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user i cannot create feedback with invalid json data
    Given I set valid API Endpoint for a user create feedback
    When I send valid request and set invalid json data for a user create feedback
    And I send valid token for a user create feedback
    Then I receive code 400
    And I receive auth error message1

  Scenario: As a user cannot create feedback with invalid token
    Given I set valid API Endpoint for a user create feedback
    When I send valid request and set valid json data for a user create feedback
    And I send invalid token for a user create feedback
    Then I receive code 401
    And I receive auth error message1

  Scenario: As a user i cannot create feedback with invalid credentials
    Given I set invalid Api Endpoint for a user create feedback
    When I send invalid request and set invalid json data for a user create feedback
    And I send invalid token for a user create feedback
    Then I receive code 404
    And I receive auth error message1