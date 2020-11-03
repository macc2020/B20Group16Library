package com.library.pages;

import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksMainTab;


// ************* SEARCH BOOK **************************************************

    String authorToLocate = "Irvin Will";

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//table[@id='tbl_books']")
    public WebElement bookTable;

    public void searchBookByAuthor(){
        searchBox.sendKeys(authorToLocate);
        BrowserUtils.wait(2);
    }

    public void bookIsLocatedByUsingSearchBox(){
        Assert.assertTrue(bookTable.getText().contains(authorToLocate));
    }

//*******************************************************************************


}
