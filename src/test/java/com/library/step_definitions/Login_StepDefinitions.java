package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sun.rmi.runtime.Log;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("user is on Library Application login page")
    public void user_is_on_library_application_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("libraryURL"));
    }


    @When("user enters valid librarian login and password")
    public void user_enters_valid_librarian_login_and_password() {

        loginPage.loginAsLibrarian();
            BrowserUtils.wait(2);
    }


    @Then("user sees the dashboard")
    public void user_sees_the_dashboard() {

        String expectedURL = "dashboard";
        String actualURL = Driver.getDriver().getCurrentUrl();
            BrowserUtils.wait(2);

        Assert.assertTrue(actualURL.contains(expectedURL));
            BrowserUtils.wait(2);
    }



    @Given("user is on librarian Dashboard page")
    public void user_is_on_librarian_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("libraryURL"));
        BrowserUtils.wait(2);

        loginPage.loginAsLibrarian();
        BrowserUtils.wait(2);
    }








}
