package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginStep {
    private  LoginPage Login_Page = new LoginPage();

    @When("I login as {string} {string}")
    public void iLoginAs(String email, String password) {
        Login_Page.writeEmail(email);
        Login_Page.writePassword(password);
        Login_Page.performLogin();

    }
}
