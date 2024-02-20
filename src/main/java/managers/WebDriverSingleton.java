package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.urlToBe;

public class WebDriverSingleton {

    private static final String BaseUrl = "https://www.w3schools.com/";
    private static final String ProfilUrl = "https://profile.w3schools.com";
    private static final String RegisterUrl = "/sign-up";
    private static final String LoginUrl = "/log-in";
    private static final String HomeUrl = "https://pathfinder.w3schools.com/";
    private static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
            wait = new WebDriverWait(getInstance(), Duration.ofSeconds(10));
        }
        return driver;
    }

    public static boolean isCurrentUrlEqualsTo(String pageName) {
        String expectedUrl;
        try {
            switch (pageName) {
                case "login":
                    expectedUrl = ProfilUrl + LoginUrl;
                    break;
                case "register":
                    expectedUrl = ProfilUrl + RegisterUrl;
                    break;
                case "home":
                    expectedUrl = HomeUrl;
                    break;
                default:
                    throw new RuntimeException("Unexpected value:" + pageName);
            }
            return wait.until(urlToBe(expectedUrl));
        } catch (Exception ignored) {
            return false;
        }
    }

    public static void navigateTo(String pageName) {
        switch (pageName) {
            case "login":
                getInstance().get(ProfilUrl + LoginUrl);
                break;
            case "register":
                getInstance().get(ProfilUrl + RegisterUrl);
                break;
            default:
                throw new RuntimeException("Unexpected value:" + pageName);
        }
    }

    public static void destroy() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
