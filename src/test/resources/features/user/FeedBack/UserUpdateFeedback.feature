@UserFeedback
Feature: Update Feedback
  As a user
  I want to update feedback
  So that i can update feedback

  Scenario: As a user I can update feedback with valid credentials
    Given I set valid API endpoint for a user update feedback
    When I send valid request and set valid json data for a user update feedback
    And I send valid token for a user update feedback
    Then I receive code 201
    And User Successfully update feedback

  Scenario: As a user I cannot update feedback with invalid API Endpoint
    Given I set invalid API endpoint for a user update feedback
    When I send valid request and set valid json data for a user update feedback 1
    And I send valid token for a user update feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update feedback with invalid request method
    Given I set valid API endpoint for a user update feedback
    When I send invalid request and set valid json data for a user update feedback
    And I send valid token for a user update feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update feedback with invalid token
    Given I set valid API endpoint for a user update feedback
    When I send valid request and set valid json data for a user update feedback
    And I send invalid token for a user update feedback
    Then I receive code 401
    And I receive auth error message1

  Scenario: As a user I cannot update feedback with invalid json data
    Given I set valid API endpoint for a user update feedback
    When I send valid request and set invalid json data for a user update feedback
    And I send valid token for a user update feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update feedback with invalid request credentials
    Given I set invalid API endpoint for a user update feedback
    When I send invalid request and set invalid json data for a user update feedback
    And I send invalid token for a user update feedback
    Then I receive code 404
    And I receive auth error message1