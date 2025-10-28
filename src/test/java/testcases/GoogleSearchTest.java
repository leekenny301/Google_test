package testcases;

import framework.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void test() {
        googlePage.setSearchField("Google");
        googlePage.submitSearch();
        Assert.assertTrue(driver.getTitle().contains("Google - Google Search"));
        // Test is failing cause Google detected that automation is running
        // So a captcha is returned
    }
}
