package com.library.step_definitions;

import com.library.pages.Mac2020LandingPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Macc2020_StepDefinitions {


    Mac2020LandingPage mac2020LandingPage=new Mac2020LandingPage();

    @When("I click on the Users link")
    public void i_click_on_the_link() {
        BrowserUtils.wait(2);
        mac2020LandingPage.userPageLink.click();

    }

    @When("I clicks on Edit User button")
    public void i_clicks_on_edit_user_button() {
       BrowserUtils.wait(2);
       mac2020LandingPage.editUserButton.click();
    }
    @Then("Edit User Information page opens")
    public void edit_user_information_page_opens() {
        BrowserUtils.wait(2);
        String expected="Edit User Information";
        System.out.println(expected);

        String actual=mac2020LandingPage.editUserInformation.getText();
        System.out.println(actual);




    }
}
