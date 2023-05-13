package pl.testeroprogramowania.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(id = "reg_email")
    private WebElement regEmailInput;

    @FindBy(id="reg_password")
    private  WebElement regPasswordInput;

    @FindBy(name="register")
    private WebElement registerButton;

    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

        //        driver.findElement(By.id("reg_email")).click();

    }

    public LoggedUserPage registerUser (String email, String password){
        regEmailInput.sendKeys(email);
        regPasswordInput.sendKeys(password);
        registerButton.click();
        return new LoggedUserPage(driver);

    }

}
