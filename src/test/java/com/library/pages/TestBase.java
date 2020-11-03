package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class TestBase {
    public TestBase(){ PageFactory.initElements(Driver.getDriver(), this); }
    @FindBy(linkText = "Dashboard")
    public WebElement dashboardPageLink;
    @FindBy(linkText = "Users")
    public WebElement userPageLink;
    @FindBy(linkText = "Books")
    public WebElement booksPageLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement accountUserName;


}
