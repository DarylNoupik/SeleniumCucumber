package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Page;

public class LoginPage extends Page {
     @FindBy(id ="modalusername")
     WebElement email ;
     @FindBy(id="current-password")
     WebElement password ;
     @FindBy(className = "Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu")
     WebElement connexionButton ;
     

     public void writeEmail(String Email){
          writeText(email,Email);
     }
     public void writePassword(String Password){
          writeText(password, Password);
     }
     public void performLogin(){
          clickOn(connexionButton);
     }
     
    
}
