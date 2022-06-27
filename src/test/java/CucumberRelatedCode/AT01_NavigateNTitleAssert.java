package CucumberRelatedCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateNTitleAssert {

    public static void NavHn() throws IOException {
        OpenBrowser.NavtoWebsite(ReadPropertiesFile.PropFile("HNhomePage"));
// implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static void AssertTitle(){
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("HNTitle : "+ActualTitle);
        String ExpectedTitle = "Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
        //Assertion Version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }


}
