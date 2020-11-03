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

//****************** Edit Book **************************************************

    @FindBy(xpath = "//table[@id='tbl_books']//td[1]")
    public WebElement EditBooksButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement bookNameInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChangesButton;

    public void searchBookByName (String name){
        searchBox.sendKeys(name);
    }


    public void editBookNameAssertion(){
        String newName = "Wonderland";

        bookNameInputBox.clear();
        bookNameInputBox.sendKeys(newName);
        saveChangesButton.click();
        BrowserUtils.wait(2);

        searchBookByName(newName);
        BrowserUtils.wait(2);

        Assert.assertTrue(bookTable.getText().contains(newName));
    }
// *******************************************************************************

}
