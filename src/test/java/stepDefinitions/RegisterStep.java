package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

import java.util.List;
import java.util.Map;

public class RegisterStep {

    public final RegisterPage registerPage = new RegisterPage();
    @And("I validate the register form")
    public void iValidateTheRegisterForm() {
        registerPage.performRegister();
    }
    @When("I fullfilled the form with the informations below")
    public void iFullfilledTheFormWithTheInformationsBelow(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Map<String, String> data = rows.get(0);
        registerPage.writeEmail(data.get("email"));
        registerPage.writePassword(data.get("password"));
    }
    @Then("I receive an confirmation message")
    public void iReceiveAnConfirmationMessage() {
        registerPage.waitForConfirmationMessage();
    }

    @And("I fullfilled the form with the users information below")
    public void iFullfilledTheFormWithTheUsersInformationBelow(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Map<String, String> data = rows.get(0);
        registerPage.writeFirstName(data.get("firstname"));
        registerPage.writeLastname(data.get("lastname"));
        registerPage.performContinuousAction();
    }
}
