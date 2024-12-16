package com.therohitsahu.ex_03testNGExamples;
import org.testng.Assert;
import org.testng.annotations.Test;
public class APITesting_022_TestNG_incocationCount {
    @Test(invocationCount = 3)
    public void test01() {
        Assert.assertTrue(true);
    }
}
