package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailInputBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;


    public void login(String username, String password){
        emailInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();
    }

    public void loginAsLibrarian(){
        String username = ConfigurationReader.getProperty("usernameLibrarian");
        String password = ConfigurationReader.getProperty("passwordLibrarian");

        emailInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();
    }



















}
