package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int random = (int) (Math.random()*1000);

        WebElement dashBoardLink = new HomePage(driver).openMyAccountPage()
                .registerUser("test"+random+"@wp.pl", "test56@wp.pl").getDashBoardLink();

        Assert.assertEquals(dashBoardLink.getText(), "DashBoard");
    }

    @Test
    public void registerUserWithSameEmailTest() {
        WebElement error = new HomePage(driver).openMyAccountPage()
                .registerUser("test1@test.pl", "test@test.pl").getError();

        Assert.assertTrue(error.getText().contains("An account is already registered with your email address"));
    }

}