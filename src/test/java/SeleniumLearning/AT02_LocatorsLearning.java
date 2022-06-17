package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AT02_LocatorsLearning {

    @Test
    public void locLearn(){
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point we have a empty browser opened
        //maximize the browser
        driver.manage().window().maximize();
        //Navigate to webpage
        driver.get("https://www.harveynorman.com.au/customer/account/create/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //by id
        driver.findElement(By.id("firstname")).sendKeys("FirstName");
        //by name
        driver.findElement(By.name("lastname")).sendKeys("LastName");
        //default xpath-- which we shouldnt use later on
        driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys("email");
        //default css-- which we shouldnt use later on
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //by link text
        driver.findElement(By.linkText("Help & Support")).click();

    }
}
