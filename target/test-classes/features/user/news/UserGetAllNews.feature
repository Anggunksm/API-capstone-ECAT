@User
Feature: Get All News
  As a user
  I want to get all news
  So that I can get all news

  Scenario: As a user I can get all news with valid credentials
    Given I set valid Api Endpoint for user get all news
    When I send valid request and valid token for user get all news
    Then I receive status code 200
    And User can get all news

  Scenario: As a user I cannot get all news with invalid Api Endpoint
    Given I set invalid Api Endpoint for user get all news
    When I send valid request and valid token for user get all news 1
    Then I receive status code 404
    And I receive auth error message

#  Scenario: As a user I cannot get all news with invalid request method
#    Given I set valid Api Endpoint for user get all news
#    When I send invalid request and valid token user for get all news
#    Then I receive status code 404
#    And I receive auth error message

  Scenario: As a user I cannot get all news with invalid token
    Given I set valid Api Endpoint for user get all news
    When I send valid request and invalid token for user get all news
    Then I receive status code 401
    And I receive auth error message

  Scenario: As a user I cannot get all news with invalid credentials
    Given I set invalid Api Endpoint for user get all news
    When I send invalid request and invalid token for user get all news
    Then I receive status code 404
    And I receive auth error message