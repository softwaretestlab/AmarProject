package BasicsOfJava;

import org.junit.Test;

public class AT10_ArrayLoop {

    @Test
    public void ArrayLoopUsingForLoop() {
        //Variable age is an array
        int[] age={10,20,30,40,50,60};
        // length of array
       int lengthOfArray= age.length;
        System.out.println("length of arrray is : "+lengthOfArray);
        //for loop
        for(int i=0;i<lengthOfArray;i++){
            System.out.println(age[i]);

        }
    }
}
