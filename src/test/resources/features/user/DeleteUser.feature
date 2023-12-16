@User
Feature: Delete USer
  As a user
  I want to delete user
  So that my account can be deleted

  Scenario: As a user I can delete user with valid credentials
    Given I set valid Api Endpoint for delete user
    When I send valid request and valid token for delete user
    Then I receive status code 204

  Scenario: As a user I cannot delete user with invalid Api Endpoint
    Given I set invalid Api Endpoint for delete user
    When I send valid request and valid token for delete user 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot delete user with invalid request method
    Given I set valid Api Endpoint for get all admin
    When I send invalid request and valid token for get all admin
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot delete user with invalid token
    Given I set valid Api Endpoint for delete user
    When I send valid request and invalid token for delete user
    Then I receive status code 401
    And I receive auth error message

  Scenario: As a user I cannot delete user with invalid credentials
    Given I set invalid Api Endpoint for delete user
    When I send invalid request and invalid token for delete user
    Then I receive status code 404
    And I receive auth error message

    
