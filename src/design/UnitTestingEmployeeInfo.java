package design;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingEmployeeInfo {

    @Test
    public void calculateEmloyeeBonus1(){
        int Expected_resault = 9600;
        int current=EmployeeInfo.calculateEmployeeBonus(2,120000);
        Assert.assertEquals(Expected_resault,current);
        System.out.println("passed");

    }
}