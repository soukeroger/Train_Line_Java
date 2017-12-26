import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.cssSelector;

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
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.thetrainline.com/");
        Assert.assertTrue("title should start with Trainline", driver.getTitle().startsWith("Trainline"));
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='originStation']")).sendKeys("Southampton");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='destinationStation']")).sendKeys("Leeds");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove.is-alone")).click();
        driver.findElement(By.id("submitButton")).click();
        driver.close();
        driver.quit();
    }

    @Test

    public void trainLineExercise3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\workspace\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.thetrainline.com/");
        Assert.assertTrue("title should start with Trainline", driver.getTitle().startsWith("Trainline"));
        Thread.sleep(5000);
        driver.findElement(By.id("journey-type-return")).click();
        driver.findElement(By.xpath(".//*[@id='originStation']")).sendKeys("Derby");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='destinationStation']")).sendKeys("Leeds");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove.is-alone")).click();
        driver.findElement(By.id("submitButton")).click();
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Page title contains 'Trainline'", pageTitle.contains("Trainline"));
//        driver.close();
//        driver.quit();

    }


    @Test

    public void trainLineExercise2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\workspace\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.thetrainline.com/");
        Assert.assertTrue("title should start with Trainline", driver.getTitle().startsWith("Trainline"));
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='originStation']")).sendKeys("Southampton");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='destinationStation']")).sendKeys("Leeds");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove.is-alone")).click();
        driver.findElement(By.id("submitButton")).click();
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Page title contains 'Trainline'", pageTitle.contains("Trainline"));
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
        driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a")).click();
        driver.findElement(cssSelector(".product_img_link > img:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
//
//        String boxColor = driver.findElement(By.id("color_14")).getCssValue("background-color").trim();
//        Assert.assertEquals(boxColor, true, "rgb(93, 156, 236)");
//        System.out.println("rgba(93, 156, 236, 1)\"" + color);
//        driver. findElement(id("color_14")).get.underlying.getCssValue("background-color")
//        colorIsBlue shouldBe  "rgba(93, 156, 236, 1)"


//        driver.close();
//        driver.quit();
    }


    @Test

    public void manchesterAirportWebdriver() throws InterruptedException  {
//        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to(" https://shop.manchesterairport.co.uk/");
        Assert.assertTrue("title should start with Shopping",
                driver.getTitle().startsWith("Shopping"));
        driver.findElement(By.xpath(".//*[@id='my-page']/nav/div[2]/div/div/div/div[2]/div[1]/div/ul/li[1]/a")).click();
        driver.getPageSource().contains("Beauty");
        driver.findElement(By.cssSelector(".col-xs-24.third-tier>a")).click();
////        driver.close();
//        driver.quit();

    }

}

