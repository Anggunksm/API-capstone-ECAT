@Admin
Feature: Delete News
  As an admin
  I want to delete news
  So that my news can be deleted
  @AdminDeleteNews1
  Scenario: As an admin I can delete news with valid credentials
    Given I set valid Api Endpoint for delete news
    When I send valid request and valid token for delete news
    Then I receive status code 204

  Scenario: As an admin I cannot delete news with invalid Api Endpoint
    Given I set invalid Api Endpoint for delete news
    When I send valid request and valid token for delete news 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot delete news with invalid request method
    Given I set valid Api Endpoint for delete news
    When I send invalid request and valid token for delete news
    Then I receive status code 400
    And I receive error message

  Scenario: As an admin I cannot delete news with invalid token
    Given I set valid Api Endpoint for delete news
    When I send valid request and invalid token for delete news
    Then I receive status code 401
    And I receive auth error message

  Scenario: As an admin I cannot delete news with invalid credentials
    Given I set invalid Api Endpoint for delete news
    When I send invalid request and invalid token for delete news
    Then I receive status code 404
    And I receive auth error message