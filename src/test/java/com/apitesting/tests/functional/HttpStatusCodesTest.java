package com.apitesting.tests.functional;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HttpStatusCodesTest {

    @DataProvider(name = "statusCodes")
    public Object[][] statusCodes() {
        return new Object[][] {
            { 200, "OK", true },
            { 201, "Created", true },
            { 204, "No Content", true },
            { 400, "Bad Request", false },
            { 404, "Not Found", false },
            { 500, "Internal Server Error", false },
        };
    }

    @Test(dataProvider = "statusCodes", groups = { "functional" })
    public void successfulStatusIs2xx(int code, String reason, boolean success) {
        boolean is2xx = code >= 200 && code < 300;
        Assert.assertEquals(is2xx, success, "Status " + code + " (" + reason + ") classified wrong");
    }
}
