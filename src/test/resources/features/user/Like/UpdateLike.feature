@LikeUser
Feature: Update Like
  As a user
  I want to update like
  So that i can update like

  Scenario: As a user I can update like with valid credentials
    Given I set valid API endpoint for update like
    When I send valid request and set valid json data for update like
    And I send valid token for update like
    Then I receive code 201
    And I Successfully update like

  Scenario: As a user I cannot update like with invalid API Endpoint
    Given I set invalid API endpoint for update like
    When I send valid request and set valid json data for update like 1
    And I send valid token for update like
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update like with invalid request method
    Given I set valid API endpoint for update like
    When I send invalid request and set valid json data for update like
    And I send valid token for update like
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update user with invalid token
    Given I set valid API endpoint for update user
    When I send valid request and set valid json data for update user
    And I send invalid token for update user
    Then I receive code 401
    And I receive auth error message1

  Scenario: As a user I cannot update like with invalid json data
    Given I set valid API endpoint for update like
    When I send valid request and set invalid json data for update like
    And I send valid token for update like
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update like with invalid request credentials
    Given I set invalid API endpoint for update like
    When I send invalid request and set invalid json data for update like
    And I send invalid token for update like
    Then I receive code 404
    And I receive auth error message1