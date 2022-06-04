package BasicsOfJava;

import org.junit.Test;
import java.util.HashMap;

public class AT12_HashMap {

    @Test
    public void test16(){
// here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String,Integer> map=new HashMap();
        map.put("Ricky",11);
        map.put("Bianca",8);
        map.put("Sophy",13);
        System.out.println("print all key:values in map on console :" +map);
        int mapSize=map.size();
        System.out.println("hasmap size is : "+mapSize);
// here we used if condition
        // to go into if loop we have to give a condition
        if(map.containsKey("Sophy")){
            int keyval=map.get("Sophy");
            System.out.println("key value for Sophy is : "+keyval);

        }


    }
}
