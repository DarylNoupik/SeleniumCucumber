package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class RegisterPage extends Page {
    @FindBy(id ="modalusername")
    WebElement inputEmail ;
    @FindBy(id="new-password")
    WebElement inputPassword ;
    @FindBy(className = "Button_button__URNp+")
    WebElement registerButton ;
    @FindBy(id="modal_first_name")
    WebElement inputFirstName ;
    @FindBy(id="modal_last_name")
    WebElement inputLastName ;
    @FindBy(className = "Button_button__URNp+")
    WebElement continueButton ;
    @FindBy(className ="Alert_iwrp__5q1xH")

    WebElement confirmationMessage;

    public void writeEmail(String email){
        writeText(inputEmail,email);
    }
    public void writePassword(String Password){
        writeText(inputPassword,Password);
    }
    public void writeLastname(String Lastname){
        writeText(inputLastName,Lastname);
    }
    public void writeFirstName(String Firstname){
        writeText(inputFirstName,Firstname);
    }
    public void performRegister(){
        clickOn(registerButton);
    }
    public void performContinuousAction(){
        clickOn(continueButton);
    }

    public void waitForConfirmationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(confirmationMessage));
    }

}
