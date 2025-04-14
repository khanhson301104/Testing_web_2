Feature: Login Functionality
  As a user
  I want to be able to login
  So that I can access my account

  Scenario Outline: Successful login with valid credentials
    Given I navigate to the login page
    When I enter username "<username>"
    And I enter password "<password>"
    And I click on login button
    Then I should see success message

    Examples:
      | username | password     |
      | user123  | password123  |
      | user456  | password456  |
      | user789  | password789  |
