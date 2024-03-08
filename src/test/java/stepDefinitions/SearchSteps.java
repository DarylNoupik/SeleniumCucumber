package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class SearchSteps {

    HomePage homePage = new HomePage();

    @When("I enter {string} in the search bar")
    public void iEnterInTheSearchBar(String word) throws InterruptedException {
        homePage.waitForLogout();
        homePage.search(word);
        Thread.sleep(5000);
    }

    @Then("I should see a list of exercises\\/tutorials about {string}")
    public void iShouldSeeAListOfExercisesTutorialsAbout(String word) {
        boolean result = homePage.checkTitle(word);
        Assert.assertTrue(result, "No search results containing the expected term were found");

    }
}
