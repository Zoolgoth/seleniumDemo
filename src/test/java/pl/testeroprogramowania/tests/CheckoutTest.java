package pl.testeroprogramowania.tests;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;
public class CheckoutTest extends BaseTest {
    @Test
    public void checkoutTest() {

        new HomePage(driver).openShopPage().openProduct("Java Selenium WebDriver")
                .addProductToCart().viewCart().openAddressDetails();

//        WebElement dashboardLink = new HomePage(driver)
//                .openMyAccountPage()
//                .registerUserValidData("test111" + random + "@wp.pl", "test111@wp.pl")
//                .getDashboardLink();
//
//        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }
}