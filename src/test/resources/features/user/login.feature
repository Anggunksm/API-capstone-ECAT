@Login

  Feature: Login
    As a user
    I want to login
    So that I can access other features

    @PositiveCase
    Scenario: As a user I can login with valid credentials
      Given I set valid endpoint for user login
      When I send post request with valid json data to login
      Then I receive status code 200
      And I receive message "Success Create Account"