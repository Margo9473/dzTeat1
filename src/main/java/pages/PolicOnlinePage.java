package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicOnlinePage extends StartPage {

    public PolicOnlinePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    @FindBy(xpath = "//p[6]/a[contains(text(),'Узнать подробнее')]")
    private WebElement knowMore;

    public WebElement getKnowMore() {
        return knowMore;
    }

    public TravelPolicPage clickKnowMore() {
        getKnowMore().click();
        return new TravelPolicPage(driver);
    }
}
