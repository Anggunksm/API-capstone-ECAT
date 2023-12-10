@Tuy
Feature: Search User By Name
  As an User
  I want to Search User By Name
  So that I can Search User By Name

  Scenario: As a user I can Search User By Name with valid credentials
    Given I set valid Api Endpoint for Search User By Name
    When I send valid request and valid token for Search User By Name
    Then I receive status code 200
    And I can find user that i want

  Scenario: As a user I cannot Search User By Name with invalid Api Endpoint
    Given I set invalid Api Endpoint for Search User By Name
    When I send valid request and valid token for Search User By Name 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot Search User By Name with invalid request method
    Given I set valid Api Endpoint for Search User By Name
    When I send invalid request and valid token for Search User By Name
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot Search User By Name with invalid token
    Given I set valid Api Endpoint for Search User By Name
    When I send valid request and invalid token for Search User By Name
    Then I receive status code 401
    And I receive auth error message

  Scenario: As a user I cannot Search User By Name with invalid credentials
    Given I set invalid Api Endpoint for Search User By Name
    When I send invalid request and invalid token for Search User By Name
    Then I receive status code 404
    And I receive auth error message