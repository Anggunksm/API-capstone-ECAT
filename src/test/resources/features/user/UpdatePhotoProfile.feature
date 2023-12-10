@A
Feature: Update Photo Profile
  As a user
  I want to update photo profile
  So that i can change my profile photo
@1
  Scenario: As a user i can update photo profile with valid credentials
    Given I set valid API Endpoint for update photo profile
    When I send valid request and valid body for update photo profile
    And I send valid token for update photo profile
    Then I receive code 201
    And I successfully updated my profile photo

  Scenario: As a user I cannot update photo profile invalid API Endpoint
    Given I set invalid API endpoint for update photo profile
    When I send valid request and set valid json data for update photo profile 1
    And I send valid token for update photo profile
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update photo profile with invalid request method
    Given I set valid API Endpoint for update photo profile
    When I send invalid request and set valid json data for update photo profile
    And I send valid token for update photo profile
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update photo profile with invalid token
    Given I set valid API Endpoint for update photo profile
    When I send valid request and valid body for update photo profile
    And I send invalid token for update photo profile
    Then I receive code 401
    And I receive auth error message1

  Scenario: As a user I cannot update photo profile with invalid json data
    Given I set valid API Endpoint for update photo profile
    When I send valid request and set invalid json data for update photo profile
    And I send valid token for update photo profile
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update photo profile with invalid request credentials
    Given I set invalid API endpoint for update photo profile
    When I send invalid request and set invalid json data for update photo profile
    And I send invalid token for update photo profile
    Then I receive code 404
    And I receive auth error message1



