package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePages {
    WebDriver driver;

    public BasePages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, BasePages.class);
    }

    public BasePages() {
    }
}
