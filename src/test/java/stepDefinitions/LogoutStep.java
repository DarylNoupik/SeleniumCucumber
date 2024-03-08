package stepDefinitions;


import io.cucumber.java.en.When;
import pages.HomePage;


public class LogoutStep {

    final HomePage homePage = new HomePage();
    @When("I logout")
    public void iLogout() {
        homePage.waitForLogout();
        homePage.performLogout();
    }
}
