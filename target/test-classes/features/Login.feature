Feature: Verifying Login Functionality

  Scenario: Verify user can login into the application
    Given user open the website
    When user enter the username "TestAutomation@Hello.com" and password "Test@123"
    Then verify user is navigated to homepage
