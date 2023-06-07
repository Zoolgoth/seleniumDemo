package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int random = (int) (Math.random()*1000);

        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .registerUserValidData("test111"+random+"@wp.pl", "test111@wp.pl").getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }


    @Test
    public void registerUserWithSameEmailTest() {
        WebElement error = new HomePage(driver).openMyAccountPage()
                .registerUserInvalidData( "test111@wp.pl", "test111@wp.pl").getError();

        Assert.assertTrue(error.getText().contains("An account is already registered with your email address"));
    }

}