package com.library.step_definitions;

import com.library.pages.EditUserPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditUser_StepDefinitions {

    EditUserPage editUserPage = new EditUserPage();

    @When("I click on the {string} link")
    public void i_click_on_the_link(String string) {
        BrowserUtils.wait(2);
        editUserPage.userPageLink.click();

    }

    @When("I clicks on Edit User button")
    public void i_clicks_on_edit_user_button() {
        BrowserUtils.wait(2);
       editUserPage.editUserButton.click();
    }
    @Then("Edit User Information page opens")
    public void edit_user_information_page_opens() {
        BrowserUtils.wait(2);
        String expected="Edit User Information";
        System.out.println(expected);
        String actual= editUserPage.editUserInformation.getText();

        System.out.println(actual);
        Assert.assertTrue(actual.equals(expected));
    }

}
