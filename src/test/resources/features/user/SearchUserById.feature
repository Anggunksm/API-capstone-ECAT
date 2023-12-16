@User
Feature: Search User By Id
  As an User
  I want to Search User By Id
  So that I can Search User By Id

  Scenario: As a user I can Search User By Id with valid credentials
    Given I set valid Api Endpoint for Search User By Id
    When I send valid request and valid token for Search User By Id
    Then I receive status code 200
    And I can find user that i want

  Scenario: As a user I cannot Search User By Id with invalid Api Endpoint
    Given I set invalid Api Endpoint for Search User By Id
    When I send valid request and valid token for Search User By Id 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot Search User By Id with invalid request method
    Given I set valid Api Endpoint for Search User By Id
    When I send invalid request and valid token for Search User By Id
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot Search User By Id with invalid token
    Given I set valid Api Endpoint for Search User By Id
    When I send valid request and invalid token for Search User By Id
    Then I receive status code 401
    And I receive auth error message

  Scenario: As a user I cannot Search User By Id with invalid credentials
    Given I set invalid Api Endpoint for Search User By Id
    When I send invalid request and invalid token for Search User By Id
    Then I receive status code 404
    And I receive auth error message