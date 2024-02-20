package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
    @FindBy(id ="logout-link")
    WebElement logoutButton ;
    @FindBy(id="tnb-google-search-input")
    WebElement inputSearch ;

    public void search(String word){
        writeText(inputSearch,word);
    }

    public void performLogout(){
        clickOn(logoutButton);
    }
}
