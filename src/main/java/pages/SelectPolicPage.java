package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPolicPage extends InsureTrevelPage {


    @FindBy(xpath = "//*[@id='views']//section[2]/div[1]/div[1]")
    private WebElement minPrice;

    @FindBy(css = "span.b-continue-btn")
    private WebElement formalize;

    public SelectPolicPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, SelectPolicPage.class);
    }

    public WebElement getMinPrice() {
        return minPrice;
    }

    public WebElement getFormalize() {
        return formalize;
    }

    public RegistrationPage selectMinPrice() throws Exception{
        Thread.sleep(12000);
        getMinPrice().click();
        getFormalize().click();
        return PageFactory.initElements(driver,RegistrationPage.class);
    }
}
