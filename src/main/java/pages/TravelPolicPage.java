package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelPolicPage extends StartPage {

    @FindBy(xpath = "//a[@href='https://online.sberbankins.ru/store/vzr/index.html']/IMG")
    private WebElement SelectOntinePolic;

    public TravelPolicPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getSelectOntinePolic() {
        return SelectOntinePolic;
    }

    public SelectPolicPage selectOntinePolic(){
        getSelectOntinePolic().click();

        while (!driver.getTitle().equals("Сбербанк страхование")) {
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }
        }

        return PageFactory.initElements(driver, SelectPolicPage.class);
    }
}
