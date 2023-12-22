@Feedback
Feature: Admin Create Feedback
  As an admin
  I want to create feedback
  So that I can create feedback

  Scenario: As an admin I can create feedback with valid credentials
    Given I set valid API Endpoint for admin create feedback
    When I send valid request and set valid json data for admin create feedback
    And I send valid token for admin create feedback
    Then I receive code 201
    And I successfully create feedback

  Scenario: As an admin I cannot create feedback with invalid API Endpoint
    Given I set invalid Api Endpoint for admin create feedback
    When I send valid request and set valid json data for admin create feedback 1
    And I send valid token for admin create feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin i cannot create feedback with invalid request
    Given I set valid API Endpoint for admin create feedback
    When I send invalid request and set valid json data for admin create feedback
    And I send valid token for admin create feedback
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin i cannot create feedback with invalid json data
    Given I set valid API Endpoint for admin create feedback
    When I send valid request and set invalid json data for admin create feedback
    And I send valid token for admin create feedback
    Then I receive code 400
    And I receive auth error message1

  Scenario: As an admin i cannot create feedback with invalid token
    Given I set valid API Endpoint for admin create feedback
    When I send valid request and set valid json data for admin create feedback
    And I send invalid token for admin create feedback
    Then I receive code 401
    And I receive auth error message1

  Scenario: As an admin i cannot create feedback with invalid credentials
    Given I set invalid Api Endpoint for admin create feedback
    When I send invalid request and set invalid json data for admin create feedback
    And I send invalid token for admin create feedback
    Then I receive code 404
    And I receive auth error message1