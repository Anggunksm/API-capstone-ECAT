@LikeUser
Feature: Get All Like
  As a user
  I want to get all like
  So that I can get all like
  @GetAllLike1
  Scenario: As a user I can get all like with valid credentials
    Given I set valid Api Endpoint for user get all like
    When I send valid request and valid token for user get all like
    Then I receive status code 200
    And User can get all like

  Scenario: As a user I cannot get all like with invalid Api Endpoint
    Given I set invalid Api Endpoint for user get all like
    When I send valid request and valid token for user get all like 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot get all like with invalid request method
    Given I set valid Api Endpoint for user get all like
    When I send invalid request and valid token user for get all like
    Then I receive status code 404
    And I receive auth error message

  Scenario: As a user I cannot get all like with invalid token
    Given I set valid Api Endpoint for user get all like
    When I send valid request and invalid token for user get all like
    Then I receive status code 401
    And I receive auth error message

  Scenario: As a user I cannot get all like with invalid credentials
    Given I set invalid Api Endpoint for user get all like
    When I send invalid request and invalid token for user get all like
    Then I receive status code 404
    And I receive auth error message