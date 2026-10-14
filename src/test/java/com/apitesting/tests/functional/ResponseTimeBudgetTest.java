package com.apitesting.tests.functional;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ResponseTimeBudgetTest {

    private static boolean withinBudget(long responseTimeMs, long budgetMs) {
        return responseTimeMs >= 0 && responseTimeMs <= budgetMs;
    }

    @DataProvider(name = "budgets")
    public Object[][] budgets() {
        return new Object[][] {
            { 120L, 500L, true },
            { 500L, 500L, true },
            { 501L, 500L, false },
            { 0L, 100L, true },
            { -1L, 500L, false },
        };
    }

    @Test(dataProvider = "budgets", groups = { "functional" })
    public void responseTimeFitsBudget(long responseTimeMs, long budgetMs, boolean expected) {
        Assert.assertEquals(withinBudget(responseTimeMs, budgetMs), expected,
                "Response time " + responseTimeMs + "ms vs budget " + budgetMs + "ms classified wrong");
    }
}
