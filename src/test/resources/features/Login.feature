@login
  Feature: login functionality

    Scenario: login with valid librarian credentials
      Given user is on Library Application login page
      When user enters valid librarian login and password
      Then user sees the dashboard
