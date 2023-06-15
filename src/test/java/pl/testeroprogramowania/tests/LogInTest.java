package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("test111@wp.pl", "test111@wp.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }


    @Test
    public void LogInWithInvalidPasswordTest() {
        WebElement error = new HomePage(driver).openMyAccountPage()
                .logInInvalidData( "test111@test.pl", "te@test.pl")
                .getError();

        Assert.assertTrue(error.getText().contains(" Incorrect username or password."), "Expected error text doesn't match");
    }

}