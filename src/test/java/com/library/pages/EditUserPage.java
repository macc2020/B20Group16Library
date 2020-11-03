package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUserPage extends TestBase {

    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    public WebElement editUserButton;
    @FindBy(xpath = "//h5[@class= 'modal-title']")
    public WebElement editUserInformation;



}
