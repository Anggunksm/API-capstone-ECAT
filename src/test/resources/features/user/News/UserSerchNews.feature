@User
Feature: Search News
  As a user
  I want to search news
  So that I can search news

#  Scenario: As a user I can search news with valid credentials
#    Given I set valid Api Endpoint for user search news
#    When I send valid request and valid token for user search news
#    Then I receive status code 200
#    And User can search news

  Scenario: As a user I cannot search news with invalid Api Endpoint
    Given I set invalid Api Endpoint for user search news
    When I send valid request and valid token for user search news 1
    Then I receive status code 404
    And I receive auth error message

#  Scenario: As a user I cannot search news with invalid request method
#    Given I set valid Api Endpoint for user search news
#    When I send invalid request and valid token for user search news
#    Then I receive status code 404
#    And I receive auth error message

  Scenario: As a user I cannot search news with invalid token
    Given I set valid Api Endpoint for user search news
    When I send valid request and invalid token for user search news
    Then I receive status code 401
    And I receive auth error message

  Scenario: As a user I cannot search news with invalid credentials
    Given I set invalid Api Endpoint for user search news
    When I send invalid request and invalid token for user search news
    Then I receive status code 404
    And I receive auth error message


