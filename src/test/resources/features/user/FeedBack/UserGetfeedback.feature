@UserFeedback
Feature: Get All Feedback
  As a user
  I want to get all feedback
  So that I can get all feedback

  Scenario: As a user I can get all feedback with valid credentials
    Given I set valid Api Endpoint for a user get all feedback
    When I send valid request and valid token for a user get all feedback
    Then I receive status code 200
    And User can get all feedback

  Scenario: As a user I cannot get all feedback with invalid Api Endpoint
    Given I set invalid Api Endpoint for a user get all feedback
    When I send valid request and valid token for a user get all feedback 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot get all feedback with invalid request method
    Given I set valid Api Endpoint for a user get all feedback
    When I send invalid request and valid token for a user get all feedback
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot get all feedback with invalid token
    Given I set valid Api Endpoint for a user get all feedback
    When I send valid request and invalid token for a user get all feedback
    Then I receive status code 401
    And I receive auth error message

  Scenario: As a user I cannot get all feedback with invalid credentials
    Given I set invalid Api Endpoint for a user get all feedback
    When I send invalid request and invalid token for a user get all feedback
    Then I receive status code 404
    And I receive auth error message