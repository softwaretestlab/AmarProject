package LoopsNConditionalStatments;

import org.junit.Test;

public class AT05_IfElse {

    @Test
    public void IfElseLoopLearn(){

        String browser = "CHROMEhkhkjh";

        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("name is matching thats why this code is executed");
        }
        else{
            // as "CHROMEhkhkjh" is not equal to "chromes", the code in else condition will be executed
            System.out.println("names dont match , thats why this code will not be executed");
        }

        }

}
