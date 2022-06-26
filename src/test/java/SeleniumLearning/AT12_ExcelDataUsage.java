package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import excelReader.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class AT12_ExcelDataUsage {


    @Test
    public void table() throws IOException {
////        //setting up chromedriver
//        WebDriverManager.chromedriver().setup();
//        //options
//        ChromeOptions chromeOptions = new ChromeOptions();
//        //we create an object of WebDriver
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        //At this point browser will be opened
//        //maximize browser
//        driver.manage().window().maximize();
//        //Navigate to HN website
//        driver.get("https://www.harveynorman.com.au/customer/account/create/");

        //OpenBrowser.NavtoWebsite("https://www.harveynorman.com.au/customer/account/create/");
        OpenBrowser.NavtoWebsite(ReadPropertiesFile.PropFile("HNCreateAccount"));
        //implicit wait
      //  OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Here we are giving the path of excel workbook
       // Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\Data\\TestDataHN1.xlsx");
      //  Xls_Reader reader = new Xls_Reader("C:\\Users\\etikalaj\\eclipse-workspace\\AmarProject\\src\\main\\java\\Data\\TestDataHN1.xlsx");
       // Xls_Reader reader = new Xls_Reader(ReadPropertiesFile.PropFile("ExcelData"));
        Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+ReadPropertiesFile.PropFile("ExcelData"));


        // count of rows in the excel sheet
        int rowcount=reader.getRowCount("RegTestData");
        System.out.println("rowcount :"+rowcount);
        for(int j=2; j<=rowcount;j++){
            //we got firstname from excel
            String FirstName= reader.getCellData("RegTestData","FirstName",j);
            //System.out.println("FirstName : "+FirstName);

            //Here we enter First Name which we got from excel
            OpenBrowser.driver.findElement(By.id("firstname")).clear();
            OpenBrowser.driver.findElement(By.id("firstname")).sendKeys(FirstName);

            //Here we enter Last Name
            String lastname=reader.getCellData("RegTestData","LastName",j);
            OpenBrowser.driver.findElement(By.id("lastname")).clear();
            OpenBrowser.driver.findElement(By.id("lastname")).sendKeys(lastname);

            //Here we enter EmailAddress
            String email_address=reader.getCellData("RegTestData","EmailAddress",j);
            OpenBrowser.driver.findElement(By.id("email_address")).clear();
            OpenBrowser.driver.findElement(By.id("email_address")).sendKeys(email_address);


            //Here we enter Password
            String password=reader.getCellData("RegTestData","Password",j);
            OpenBrowser.driver.findElement(By.id("password")).clear();
            OpenBrowser.driver.findElement(By.id("password")).sendKeys(password);

            //Here we picked up data for RePassword from excel
            String confirmation=reader.getCellData("RegTestData","RePassword",j);
            OpenBrowser.driver.findElement(By.id("confirmation")).clear();
            OpenBrowser.driver.findElement(By.id("confirmation")).sendKeys(confirmation);

            //we are putting the output into excel
            String textName=OpenBrowser.driver.findElement(By.xpath("//*[contains(text(),'Create an account')]")).getText();
            reader.setCellData("RegTestData","Result",j,textName);



        }
    }
    }
