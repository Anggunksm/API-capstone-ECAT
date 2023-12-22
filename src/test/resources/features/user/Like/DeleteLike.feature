@Like
Feature: Delete Like
  As a user
  I want to delete like
  So that like can be deleted

  Scenario: As a user I can delete like with valid credentials
    Given I set valid Api Endpoint for delete like
    When I send valid request and valid token for delete like
    Then I receive status code 200
    And I successfully delete like

  Scenario: As a user I cannot delete like with invalid Api Endpoint
    Given I set invalid Api Endpoint for delete like
    When I send valid request and valid token for delete like 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot delete like with invalid request method
    Given I set valid Api Endpoint for delete like
    When I send invalid request and valid token for delete like
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot delete like with invalid token
    Given I set valid Api Endpoint for delete like
    When I send valid request and invalid token for delete like
    Then I receive status code 401
    And I receive auth error message

  Scenario: As a user I cannot delete like with invalid credentials
    Given I set invalid Api Endpoint for delete like
    When I send invalid request and invalid token for delete like
    Then I receive status code 404
    And I receive auth error message
