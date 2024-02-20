package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import managers.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        tags="@login and @Passant",
        plugin = {"pretty",
                 "html:target/cucumber-reports"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {

    private static WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverSingleton.getInstance();

    }
    @AfterMethod
    public void teardown(){
        WebDriverSingleton.destroy();
    }
}
