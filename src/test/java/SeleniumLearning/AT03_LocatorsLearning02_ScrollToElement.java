//package SeleniumLearning;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import jdk.nashorn.internal.ir.IfNode;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class AT03_LocatorsLearning02_ScrollToElement {
//
//
//
//    @Test
//    public void locLearn() {
//        //setting up chromedriver
//        WebDriverManager.chromedriver().setup();
//        //we create an object of WebDriver
//        WebDriver driver = new ChromeDriver();
//        //At this point we have a empty browser opened
//        //maximize the browser
//        driver.manage().window().maximize();
//        //Navigate to webpage
//        driver.get("https://www.harveynorman.com.au/customer/account/create/");
//        //implicit wait
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        // Element not getting clicked as it is not within Viewport
//
//        //  Try to use JavascriptExecutor to bring the element within the Viewport:
//        WebElement myElement =driver.findElement(By.linkText("Sitemap"));
//        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
//        jse2.executeScript("arguments[0].scrollIntoView()", myElement);
//
//        boolean SignUpLetter  = driver.findElement(By.xpath("//*[@id='wrapper']/footer/div/div/div/div/div[2]/div[2]/ul/li[3]/a")).isDisplayed();
//        if(SignUpLetter==true){
//            System.out.println("pass");
//        }
//
//        // now click on element
//        driver.findElement(By.linkText("Sitemap")).click();
//
//
//
//
//
//    }
//}
