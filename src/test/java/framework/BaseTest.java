package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.GooglePage;

public class BaseTest {
    protected static WebDriver driver;
    protected static GooglePage googlePage;

    @BeforeClass
    protected void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        googlePage = new GooglePage(driver);
    }

    @AfterClass
    protected void afterTest() {
        if (driver != null){
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            } finally {
                driver.close();
                driver.quit();
            }
        }
    }
}
