package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPolicPage extends InsureTrevelPage {

    //WebDriverWait wait = new WebDriverWait(driver,10);

    @FindBy(xpath = "//*[@id='views']//section[2]/div[1]/div[1]")
    private WebElement minPrice;

    @FindBy(css = "span.b-continue-btn")
    private WebElement formalize;

    public SelectPolicPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
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
