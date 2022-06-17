package SeleniumLearning;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {
    @Test
    public void NavtoWebPage() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point we have a empty browser opened
        //maximize the browser
        driver.manage().window().maximize();
        //Navigate to webpage
        driver.get("https://www.harveynorman.com.au/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //get title of webpage
        String ActualTitleName=driver.getTitle();
        System.out.println("ActualTitleName : "+ActualTitleName);
        String ExpectedTitle="Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
    //Assertion Version-1
        Assert.assertEquals(ExpectedTitle,ActualTitleName);
    //Assert version-2
        Assert.assertTrue(ActualTitleName.contains("Computers"));

        //Screenshot
        // this line we took screenshot and we have screenshot as file
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // now we want to copy screenshot file into png in our local machine
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\etikalaj\\screenshot.png"));
        driver.close();

    }
}
