package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class AT11_webtables {

    @Test
    public void table() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("file:///D:/SeleniumMaterial-StudentsDistribution/04_SeleniumLearning/10_WebTables/webtablehtml.html");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //get columns count
        List<WebElement> colcount=driver.findElements(By.xpath("/html/body/table/thead/tr/th"));
        int colSize=colcount.size();
        System.out.println("colsize : "+ colSize); //col count is 7

        // get row count
        List<WebElement> rowcount=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        int rowSize=rowcount.size();
        System.out.println("rowsize : "+ rowSize); //rowcount is 4


        //row1, data 1 , this is basically like hardcoding to get a specific value
        WebElement CellVal= driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
        System.out.println("print specific cell value :"+CellVal.getText());

        // to print all the values in the row which has header as "clock tower hotel"
        String sRowVal = "Clock Tower Hotel";


        //Count headings in first column [Burj Khalifa,Clock Tower Hotel,Taipei 101,Financial Center]
        List<WebElement> headCount=driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
        int NumCells= headCount.size(); //size 4


        //get count of row 2 [Saudi Arabia,Mecca,601m,2012,2,details-2]
        List<WebElement> row2Count=driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
        int RowSize= row2Count.size(); //size 6

        // this  for loop is for row headers
        for(int i=1;i<=NumCells;i++){
            //modification of xpath
            String sVal= driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/th")).getText();
            System.out.println("This is : "+sVal);
            // matching expected with actual (in this case "Clock Tower Hotel")
            if(sVal.equalsIgnoreCase(sRowVal)){
                for(int j=1; j<=RowSize;j++){
                    //modification of xpath
                    String RowData= driver.findElement(By.xpath(" /html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();

                    System.out.println("text contained inside row is : "+RowData );
                    break;

                }



            }

        }







    }
    }
