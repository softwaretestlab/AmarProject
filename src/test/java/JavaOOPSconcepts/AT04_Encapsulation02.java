package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        // this is first method which will return the sys out statment
       obj.envMethod01(30,20);

       // here we ar using return concept
       System.out.println("returned value is : "+obj.envMethod02(50,60));
        // meaning the output can be used as input for further actions
        int v = obj.envMethod02(50,60);
        int j = v*10;
        System.out.println("value of j is : "+j);


    }
}
