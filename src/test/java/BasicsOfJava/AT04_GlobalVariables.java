package BasicsOfJava;

import org.junit.Test;

public class AT04_GlobalVariables {
    //global variables
    int i=10;
    int j=20;
    String abc="testlab12e3";

    @Test
    public void test05(){
        //local variables
        int l=30;
        //data for this variable k is comming from the global variables
        int k =i+j;
        System.out.println("Value of K is : "+k); //output 30 --only global variables printed
        System.out.println("New Value is : "+(k+l)); //output 60 --local + global variables printed

    }

    @Test
    public void test06(){
        //data for this variable k is comming from the global variables
        int k =i*j;
        System.out.println("Value of K is : "+k); //output 200 --only global variables printed
        System.out.println("New Value abc is : "+abc); //output testlab12e3 --only global variables printed

    }

}
