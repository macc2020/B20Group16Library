package com.library.step_definitions;

import com.library.pages.BooksPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditBook_StepDefinitions {

    BooksPage booksPage = new BooksPage();

    @When("user searches specific book")
    public void user_searches_specific_book() {
      booksPage.searchBookByAuthor();
    }

    @When("user clicks on Edit Books button")
    public void user_clicks_on_edit_books_button() {
       booksPage.EditBooksButton.click();
    }

    @Then("user should be able to edit a book")
    public void user_should_be_able_to_edit_a_book() {
        booksPage.editBookNameAssertion();
    }




}
