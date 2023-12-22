@UpdateFeedback
Feature: Update Feedback
  As an admin
  I want to update feedback
  So that i can update feedback

  Scenario: As an admin I can update feedback with valid credentials
    Given I set valid API endpoint for admin update feedback
    When I send valid request and set valid json data for admin update feedback
    And I send valid token for admin update feedback
    Then I receive code 201
    And I Successfully update feedback

  Scenario: As an admin I cannot update feedback with invalid API Endpoint
    Given I set invalid API endpoint for admin update feedback
    When I send valid request and set valid json data for admin update feedback 1
    And I send valid token for admin update feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin I cannot update feedback with invalid request method
    Given I set valid API endpoint for admin update feedback
    When I send invalid request and set valid json data for admin update feedback
    And I send valid token for admin update feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin I cannot update feedback with invalid token
    Given I set valid API endpoint for admin update feedback
    When I send valid request and set valid json data for admin update feedback
    And I send invalid token for admin update feedback
    Then I receive code 401
    And I receive auth error message1

  Scenario: As an admin I cannot update feedback with invalid json data
    Given I set valid API endpoint for admin update feedback
    When I send valid request and set invalid json data for admin update feedback
    And I send valid token for admin update feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin I cannot update feedback with invalid request credentials
    Given I set invalid API endpoint for admin update feedback
    When I send invalid request and set invalid json data for admin update feedback
    And I send invalid token for admin update feedback
    Then I receive code 404
    And I receive auth error message1