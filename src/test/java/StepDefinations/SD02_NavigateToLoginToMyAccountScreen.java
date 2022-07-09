package StepDefinations;

import CucumberCode.AT02_NavigatetoLoginToMyAccountScreen;
import io.cucumber.java.en.Then;

public class SD02_NavigateToLoginToMyAccountScreen {
    @Then("navigate to login to my account screen")
    public void navigate_to_login_to_my_account_screen() {
        AT02_NavigatetoLoginToMyAccountScreen.NavToLogin();
    }

}
