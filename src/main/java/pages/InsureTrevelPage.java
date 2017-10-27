package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InsureTrevelPage extends BasePages {

    public InsureTrevelPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public InsureTrevelPage() {
    }
}
