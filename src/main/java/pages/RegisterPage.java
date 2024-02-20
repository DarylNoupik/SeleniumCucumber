package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page {
    @FindBy(id ="modalusername")
    WebElement inputEmail ;
    @FindBy(id="new-password")
    WebElement inputPassword ;
    @FindBy(css = ".Button_button__URNp+.Button_primary__d2Jt3 Button_fullwidth__0HLEu")
    WebElement registerButton ;
    @FindBy(id="modal_first_name")
    WebElement inputFirstName ;
    @FindBy(id="modal_last_name")
    WebElement inputLastName ;
    @FindBy(css = ".Button_button__URNp+.Button_primary__d2Jt3 Button_fullwidth__0HLEu")
    WebElement continueButton ;

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
    public void performLogin(){
        clickOn(registerButton);
    }
    public void performContinuousAction(){
        clickOn(continueButton);
    }

}
