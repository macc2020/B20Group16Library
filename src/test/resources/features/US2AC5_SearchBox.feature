@search_box_locateBook
Feature: locate book

  Scenario: user should be able to search a book
    Given user is on librarian Dashboard page
    When user clicks on Books tab
    And user types book’s info in Search box
    Then user should be able to search a book