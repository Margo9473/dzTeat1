package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicOnlinePage extends StartPage {

    public PolicOnlinePage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, PolicOnlinePage.class);

    }
    @FindBy(xpath = "//a[contains(text(),'Узнать подробнее')][3]")
    private WebElement knowMore;

    public WebElement getKnowMore() {
        return knowMore;
    }

    public TravelPolicPage clickKnowMore() {
        getKnowMore().click();
        return new TravelPolicPage(driver);
    }
}
