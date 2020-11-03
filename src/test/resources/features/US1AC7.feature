Feature: Search functionality on the User Management Page


  @Macc2020Test
  Scenario: User should be able to Edit User

    Given user is on Library Application login page
    When user enters valid librarian login and password
    And user sees the dashboard
    And I click on the Users link
    And I clicks on Edit User button
    Then Edit User Information page opens


