@UpdateNews
Feature: Update News
  As an admin
  I want to update news
  So that I can update news

  Scenario: As an admin I can update news with valid credentials
    Given I set valid API Endpoint for update news
    When I send valid request and set valid json data for update news
    And I send valid token for update news
    Then I receive code 200
    And I successfully update news

  Scenario: As an admin I cannot update news with invalid API Endpoint
    Given I set invalid Api Endpoint for update news
    When I send valid request and set valid json data for update news 1
    And I send valid token for update news
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin i cannot update news with invalid request
    Given I set valid API Endpoint for update news
    When I send invalid request and set valid json data for update news
    And I send valid token for update news
    Then I receive code 404
    And I receive auth error message1

  Scenario: As an admin i cannot update news with invalid json data
    Given I set valid API Endpoint for update news
    When I send valid request and set invalid json data for update news
    And I send valid token for update news
    Then I receive code 400
    And I receive auth error message1

  Scenario: As an admin i cannot update news with invalid token
    Given I set valid API Endpoint for update news
    When I send valid request and set valid json data for update news
    And I send invalid token for update news
    Then I receive code 401
    And I receive auth error message1

  Scenario: As an admin i cannot update news with invalid credentials
    Given I set invalid Api Endpoint for update news
    When I send invalid request and set invalid json data for update news
    And I send invalid token for update news
    Then I receive code 404
    And I receive auth error message1
