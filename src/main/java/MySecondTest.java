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

    public void trainLine() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\workspace\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.thetrainline.com/");
        Assert.assertTrue("title should start with Trainline", driver.getTitle().startsWith("Trainline"));
        Thread.sleep(5000);

        driver.findElement(By.xpath(" .//*[@id='originStation']")).sendKeys("Southampton");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(" .//*[@id='destinationStation']")).sendKeys("Leeds");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='submitButton']")).click();

        driver.close();
        driver.quit();
    }


    @Test

    public void myShop() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\workspace\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
        Assert.assertTrue("title should start with My Store", driver.getTitle().startsWith("My Store"));

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pogba@test.com");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("victoria123");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

//        driver.close();
//        driver.quit();
    }
}

