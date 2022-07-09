package CucumberCode;

import BaseClass.OpenBrowser;
import org.openqa.selenium.By;

public class AT02_NavigatetoLoginToMyAccountScreen {

    public static void NavToLogin() {

        // clicking on "account" link from menu
    OpenBrowser.driver.findElement(By.xpath("//*[@id='header']/div[1]/div/ul/li[6]/a")).click();



}
}
