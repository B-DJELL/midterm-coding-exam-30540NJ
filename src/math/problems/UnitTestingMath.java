package math.problems;

import org.junit.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //smallest number: expected 5
        LowestNumber lowestNumber = new LowestNumber();
        Assert.assertEquals(5, lowestNumber.lowestNumber());
    }
}
