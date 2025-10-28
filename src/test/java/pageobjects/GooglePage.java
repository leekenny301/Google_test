package pageobjects;

import framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PageURL;

public class GooglePage extends BasePage {
    @FindBy(xpath = "//textarea[@title='Search']") private WebElement searchField;

    public GooglePage(WebDriver driver) {
        super(driver);
        driver.get(PageURL.GOOGLE_URL.getPageURL());
    }

    public void setSearchField(String text) {
        searchField.sendKeys(text);
    }

    public void submitSearch() {
        searchField.submit();
    }
}
