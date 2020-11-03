package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBoxLocateBook_StepDefinitions {

    BooksPage booksPage = new BooksPage();

    @When("user clicks on Books tab")
    public void user_clicks_on_tab() {
        booksPage.booksMainTab.click();
        BrowserUtils.wait(2);
    }

    @When("user types book’s info in Search box")
    public void user_types_book_s_info_in_search_box() {
        booksPage.searchBookByAuthor();
    }

    @Then("user should be able to search a book")
    public void user_should_be_able_to_search_a_book() {
        booksPage.bookIsLocatedByUsingSearchBox();
    }




}
