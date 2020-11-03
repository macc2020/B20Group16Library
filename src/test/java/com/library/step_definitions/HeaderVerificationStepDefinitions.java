package com.library.step_definitions;

import com.library.pages.BooksPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeaderVerificationStepDefinitions {

    BooksPage booksPage = new BooksPage();


    @When("user clicks on “Books” tab")
    public void user_clicks_on_books_tab() {
        booksPage.booksMainTab.click();

    }

    @Then("user should be able to see the grid with following Actions, ISBN, Name, Author, Category, Year, Borrowed by header")
    public void user_should_be_able_to_see_the_grid_with_following_actions_isbn_name_author_category_year_borrowed_by_header() {
    List<String> expected = new ArrayList<>();
    expected.addAll(Arrays.asList("Actions","ISBN", "Name", "Author","Category", "Year", "Borrowed By" ));
        booksPage.actualTableHeader(expected);
    }
}
