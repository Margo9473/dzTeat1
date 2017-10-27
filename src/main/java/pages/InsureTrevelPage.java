package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InsureTrevelPage extends BasePages {

    public InsureTrevelPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, InsureTrevelPage.class);
    }
}
