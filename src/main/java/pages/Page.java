package pages;

import managers.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page {
    protected final WebDriver driver ;

    protected Page(){
        this.driver = WebDriverSingleton.getInstance();
        PageFactory.initElements(driver,this);
    }

    public void writeText(WebElement element,String text){
        element.sendKeys(text);
    }
    public void clickOn(WebElement element){
        element.click();
    }
}
