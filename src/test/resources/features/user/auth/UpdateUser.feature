@User
Feature: Update User
  As a user
  I want to update user
  So that i can update my user

  Scenario: As a user I can update user with valid credentials
    Given I set valid API endpoint for update user
    When I send valid request and set valid json data for update user
    And I send valid token for update user
    Then I receive code 201
    And I Successfully update user

  Scenario: As a user I cannot update user with invalid API Endpoint
    Given I set invalid API endpoint for update user
    When I send valid request and set valid json data for update user 1
    And I send valid token for update user
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update user with invalid request method
    Given I set valid API endpoint for update user
    When I send invalid request and set valid json data for update user
    And I send valid token for update user
    Then I receive code 404
    And I receive auth error message1

  Scenario: As a user I cannot update user with invalid token
    Given I set valid API endpoint for update user
    When I send valid request and set valid json data for update user
    And I send invalid token for update user
    Then I receive code 401
    And I receive auth error message1

#  Scenario: As a user I cannot update user with invalid json data
#    Given I set valid API endpoint for update user
#    When I send valid request and set invalid json data for update user
#    And I send valid token for update user
#    Then I receive status code 400
#    And I receive auth error message1

  Scenario: As a user I cannot update user with invalid request credentials
    Given I set invalid API endpoint for update user
    When I send invalid request and set invalid json data for update user
    And I send invalid token for update user
    Then I receive code 404
    And I receive auth error message1
