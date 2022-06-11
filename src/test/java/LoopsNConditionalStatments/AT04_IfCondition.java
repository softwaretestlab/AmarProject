package LoopsNConditionalStatments;

import org.junit.Assert;
import org.junit.Test;

public class AT04_IfCondition {

    @Test
    public void IfElseLoopLearn(){

        String browser = "CHROME";
        // as "CHROME" is not equal to "chromes", the code in if condition wont be executed
        if(browser.equalsIgnoreCase("chromes")){
            System.out.println("names dont match , thats why this code will not be executed");
        }

        // as "CHROME" is equal to "chrome", the code in this if condition wont be executed
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("name is matching thatswhy this code is executed");
        }

        System.out.println(" last step");
    }
}
