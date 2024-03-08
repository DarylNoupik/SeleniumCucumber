package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
     @FindBy(id ="modalusername")
     WebElement email ;
     @FindBy(id="current-password")
     WebElement password ;
     @FindBy(className = "Button_button__URNp+")
     WebElement connexionButton ;
     

     public void writeEmail(String value){
          writeText(email,value);
     }
     public void writePassword(String value){
          writeText(password, value);
     }
     public void performLogin(){
          clickOn(connexionButton);
     }
     
    
}
