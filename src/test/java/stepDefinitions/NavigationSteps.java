package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managers.WebDriverSingleton;
import org.testng.Assert;

public class NavigationSteps {


    @Given("^I am on the (register|login) page")
    public void iAmOnThePage(String pageName) {
        WebDriverSingleton.navigateTo(pageName);
    }


    @Then("^I should be at the (register|home|login) page")
    public void iShouldBeAtThePage(String pageName) {
        Assert.assertTrue(WebDriverSingleton.isCurrentUrlEqualsTo(pageName),"Unexpected Url:"+WebDriverSingleton.getInstance().getCurrentUrl());
    }
}
