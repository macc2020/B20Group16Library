@edit_book
Feature: edit book

  Scenario: user should be able to edit a book
    Given user is on librarian Dashboard page
    When user clicks on Books tab
    And user searches specific book
    And user clicks on Edit Books button
    Then user should be able to edit a book