Feature: Delete News Admin
  As an admin
  I can delete news
  So that News can be deleted

  Scenario: As an admin I can delete news with valid credentials
    Given I set valid Api Endpoint for delete news
    When I send valid request and valid token for delete news
    Then I receive status code 200

  Scenario: As an admin I cannot delete news with invalid Api Endpoint
    Given I set invalid Api Endpoint for delete news
    When I send valid request and valid token for delete news 1
    Then I receive status code 404
    And I receive auth error message

  Scenario: As an admin I cannot delete news with invalid request method
    Given I set valid Api Endpoint for delete news
    When I send invalid request and valid token for delete news
    Then I receive status code 404
    And I receive auth error message

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