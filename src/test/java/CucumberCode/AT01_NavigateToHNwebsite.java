package CucumberCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateToHNwebsite {

    public static void NavHN() throws IOException {
        OpenBrowser.NavtoWebsite(ReadPropertiesFile.PropFile("HNhomePage"));
        // implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void AsserTitle(){
        //get title
        String ActualTitle= OpenBrowser.driver.getTitle();
        System.out.println("HNTitle : "+ActualTitle);
        String ExpectedTitle = "Harvey Norman | Computers, Electrical, Furniture & Bedding | Harvey Norman Australia";
        //Assertion Version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }

}
