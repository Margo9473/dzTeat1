package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends BasePages {


    @FindBy(xpath = "//div[contains(@class,'header_more_nav')]//*[contains(text(), 'Застраховать себя')]")
    private WebElement menuInsureMy;

    @FindBy(xpath = "//div[contains(@class,'header_more_nav')]//*[contains(text(), 'Выбрать полис')]")
    private WebElement selectPolic;

    public StartPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public StartPage() {
    }


    public WebElement getMenuInsureMy()
    {
        return menuInsureMy;
    }

    public WebElement getSelectPolic() {
        return selectPolic;
    }

    public PolicOnlinePage selectPolic() {
        getMenuInsureMy().click();
        getSelectPolic().click();
        return PageFactory.initElements(driver, PolicOnlinePage.class);
    }
}
