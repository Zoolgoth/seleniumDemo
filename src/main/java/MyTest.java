import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyTest {
    public static void main(String[] args) throws InterruptedException {
        // Test humanbenchmark.com
        System.setProperty("webdriver.chrome.driver", "D:\\programiki\\chromePodSelenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://humanbenchmark.com/tests/reactiontime");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        // Znajdź przycisk akceptacji plików cookie
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/button")).click();


        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div/div/div/div[2]/div[1]/h1")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click!')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click to keep going')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click!')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click to keep going')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click!')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click to keep going')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click!')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click to keep going')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click!')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click to keep going')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click!')]")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div/div/div/h1/div")).click();
//        driver.findElement(By.cssSelector("#root > div > div:nth-child(4) > div.view-go.e18o0sx0.css-saet2v.e19owgy77 > div > div > div > h1 > div")).click();

    }
}