import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
