package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Page {
    @FindBy(id = "top-nav-bar-iframe")
    WebElement iframeElement;
    @FindBy(id = "logout-link")
    WebElement logoutButton;
    @FindBy(id = "tnb-google-search-input")
    WebElement inputSearch;

    public void search(String word) {
        driver.switchTo().frame(0);
        writeText(inputSearch, word);
        inputSearch.sendKeys(Keys.ENTER);

    }

    public void performLogout() {
        driver.switchTo().frame(0);
        clickOn(logoutButton);
    }

    public void waitForLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(iframeElement));
    }

    public boolean checkTitle(String word) {
        String title = driver.getTitle();
        return title.contains(word);
    }
}
