package StepDefinations;

import CucumberRelatedCode.AT04_CreatAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD04_CreateAnAccount {

    @Given("user navigates to create an account screen")
    public void user_navigates_to_create_an_account_screen() throws IOException {
        AT04_CreatAnAccount.NavCreateAcc();
    }
    @Then("Enter valid {string}, {string},{string}")
    public void enter_valid(String FirstName,String LastName, String EmailAddress) throws IOException {
        AT04_CreatAnAccount.EnterAccDetials(FirstName, LastName, EmailAddress);
    }

}
