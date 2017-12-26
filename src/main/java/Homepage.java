import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Roger.Souke on 11/12/2017.
 */
public class Homepage {

    WebDriver driver;


    public Homepage(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver = driver;
        System.out.println("Homepage object has been created");
    }

    @Test

        public  void main() throws Exception {
            //Declare our variables
            WebDriver driver;
            driver =  new ChromeDriver();
            driver.get("https://www.thetrainline.com");

            //Create a new homepage object, passing in our driver
            Homepage homepage;
            homepage = new Homepage(driver);

        String pageTitle = driver.getTitle();
        Assert.assertTrue("Page title contains 'Trainline'", pageTitle.contains("Trainline"));

//        homepage.from.sendKeys("London Bridge");

        }

    }






