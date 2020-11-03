
@HeaderVerification
  Feature: HeaderVerification

    Scenario: user should be able to see the grid with Actions, ISBN, Name, Author, Category, Year, Borrowed by header
      Given user is on librarian Dashboard page
      When user clicks on “Books” tab
      Then user should be able to see the grid with following Actions, ISBN, Name, Author, Category, Year, Borrowed by header