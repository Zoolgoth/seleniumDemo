package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import pl.testeroprogramowania.utils.DriverFactory;

public class BaseTest {

     protected WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = DriverFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
