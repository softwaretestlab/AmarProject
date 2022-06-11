package LoopsNConditionalStatments;

import org.junit.Assert;
import org.junit.Test;

public class AT06_AssertionLearing {
    @Test
    public void asserLearn(){
        String Expected="software";
        String Acutal="softwares";
        Assert.assertEquals(Expected,Acutal);

    }
}


