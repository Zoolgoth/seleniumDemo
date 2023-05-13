package pl.testeroprogramowania.tests;

import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        new HomePage(driver).openMyAccountPage();
    }

}