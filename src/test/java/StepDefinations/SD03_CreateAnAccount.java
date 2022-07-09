package StepDefinations;

import BaseClass.OpenBrowser;
import CucumberCode.AT04_CreatAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.io.IOException;

public class SD03_CreateAnAccount {

    @Given("User navigates to Create an account screen")
    public void user_navigates_to_create_an_account_screen() throws IOException {
        AT04_CreatAnAccount.NavCreateAcc();

    }
    @Then("Enter valid {string},{string},{string}")
    public void enter_valid(String FirstName, String LastName, String EmailAddress) throws IOException {
        AT04_CreatAnAccount.EnterAccDetials(FirstName,LastName,EmailAddress);


    }
}
