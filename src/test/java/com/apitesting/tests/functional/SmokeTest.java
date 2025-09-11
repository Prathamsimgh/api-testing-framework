package com.apitesting.tests.functional;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    @Test(groups = {"functional"})
    public void apiLayerCompiles() {
        Assert.assertTrue(true, "Basic smoke assertion should pass");
    }
}
