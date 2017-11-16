import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MySecondTest {

    @Test

    public void startWebdriver() {
//        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://seleniumsimplified.com/");
        Assert.assertTrue("title should start with Selenium Simplified",
         driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();

    }

    @Test

    public void trainLine() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.thetrainline.com/");
        Assert.assertTrue("title should start with Trainline",
                driver.getTitle().startsWith("Trainline"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath(" .//*[@id='from.text']")).sendKeys("Southampton");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(" .//*[@id='to.text']")).sendKeys("Leeds");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("submitButton")).click();

        driver.close();
        driver.quit();
    }
}
