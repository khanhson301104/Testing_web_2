Feature: Login Functionality
  As a user
  I want to be able to login
  So that I can access my account

  Scenario: Successful login with valid credentials
    Given I navigate to the login page
    When I enter username "user123"
    And I enter password "password123"
    And I click on login button
    Then I should see success message