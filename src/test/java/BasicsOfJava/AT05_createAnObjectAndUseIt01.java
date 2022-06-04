package BasicsOfJava;

import org.junit.Test;

public class AT05_createAnObjectAndUseIt01 {
    @Test
    public void test07(){
        System.out.println("this its test07");

        //using classname we create an object and using this object we can call methods
        AT05_createAnObjectAndUseIt01 obj = new AT05_createAnObjectAndUseIt01();
        obj.test08();
        obj.test09();
    }

    public void test08(){
        int i=10;
        int j=20;
        int k = i+j;
        //print on console
        System.out.println("Value of k is : "+k);

    }

    public void test09(){
        //declare local variables
        String test01="Software";
        String test02="testlab";
        String test03=test01+test02;
        System.out.println("value of test03 : "+test03);
    }




}
