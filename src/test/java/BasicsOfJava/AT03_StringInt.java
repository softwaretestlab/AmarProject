package BasicsOfJava;

import org.junit.Test;

public class AT03_StringInt {

@Test
    public void test03(){
    //declare local variables --meaning these variables are associated with method test03
    int i=10;
    int j=20;
    int k = i+j;
    //print on console
    System.out.println("Value of k is : "+k);
    System.out.println("Total value is : "+(i+j));
    }

    @Test
    public void test04(){
    //declare local variables
        String test01="Software";
        String test02="testlab";
        String test03=test01+test02;
        System.out.println("value of test03 : "+test03);
    }


}
