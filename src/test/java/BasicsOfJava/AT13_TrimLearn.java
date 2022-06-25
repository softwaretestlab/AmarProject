package BasicsOfJava;

import org.junit.Test;

public class AT13_TrimLearn {

    @Test
    public void TrimString(){

        String a = " software ";

        String b= "software";
                if(a.trim().equalsIgnoreCase(b)){
                    System.out.println("both values match");
                }
    }
}
