@Deletefeedback
Feature: Delete Feedback
  As an admin
  I want to delete feedback
  So that feedback can be deleted

  Scenario: As an admin I can delete feedback with valid credentials
    Given I set valid Api Endpoint for delete feedback
    When I send valid request and valid token for delete feedback
    Then I receive status code 200

  Scenario: As an admin I cannot delete feedback with invalid Api Endpoint
    Given I set invalid Api Endpoint for delete feedback
    When I send valid request and valid token for delete feedback 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot delete feedback with invalid request method
    Given I set valid Api Endpoint for delete feedback
    When I send invalid request and valid token for delete feedback
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot delete feedback with invalid token
    Given I set valid Api Endpoint for delete feedback
    When I send valid request and invalid token for delete feedback
    Then I receive status code 401
    And I receive auth error message

  Scenario: As an admin I cannot delete feedback with invalid credentials
    Given I set invalid Api Endpoint for delete feedback
    When I send invalid request and invalid token for delete feedback
    Then I receive status code 404
    And I receive auth error message
