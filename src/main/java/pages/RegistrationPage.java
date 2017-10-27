package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


public class RegistrationPage extends InsureTrevelPage {

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(name = "insured0_surname")
    private WebElement surnameZ;

    @FindBy(name = "insured0_name")
    private WebElement nameZ;

    @FindBy(name = "surname")
    private WebElement surname;

    @FindBy(name = "name")
    private WebElement name;

    @FindBy(name = "middlename")
    private WebElement middlename;

    @FindBy(xpath = "//div[@class='b-form-section-inside']//fieldset[4]//input")
    private WebElement birthDay;

    @FindBy(name = "passport_series")
    private WebElement seriaP;

    @FindBy(name = "passport_number")
    private WebElement numberPassport;

    @FindBy(name = "issuePlace")
    private WebElement issuePlace;

    @FindBy(xpath = "//section[@class='b-form-main-section']/section[3]//fieldset[2]//input")
    private WebElement dataPassport;

    @FindBy(css = "span.b-continue-btn")
    private WebElement goON;

    @FindBy(xpath = "//*[@id='views']//section[5]/div[2]/div[1]")
    private WebElement error;


    public WebElement getSurnameZ() {
        return surnameZ;
    }

    public WebElement getNameZ() {
        return nameZ;
    }

    public WebElement getSurname() {
        return surname;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getMiddlename() {
        return middlename;
    }

    public WebElement getBirthDay() {
        return birthDay;
    }

    public WebElement getSeriaP() {
        return seriaP;
    }

    public WebElement getNumberPassport() {
        return numberPassport;
    }

    public WebElement getIssuePlace() {
        return issuePlace;
    }

    public WebElement getDataPassport() {
        return dataPassport;
    }

    public WebElement getGoON() {
        return goON;
    }

    public WebElement getError() {
        return error;
    }

    public RegistrationPage fillFormsAndClick() {
        getSurnameZ().clear();
        getSurnameZ().sendKeys("Igor");

        getNameZ().clear();
        getNameZ().sendKeys("Igor");

        getSurname().clear();
        getSurname().sendKeys("Игорь");

        getName().clear();
        getName().sendKeys("Игорь");

        getMiddlename().clear();
        getMiddlename().sendKeys("Игоревич");

        getBirthDay().click();
        getBirthDay().sendKeys("01.05.1994");

        getSeriaP().clear();
        getSeriaP().sendKeys("6789");

        getNumberPassport().click();
        getNumberPassport().sendKeys("123456");

        getIssuePlace().clear();
        getIssuePlace().sendKeys("Отделением");

        getDataPassport().sendKeys("22.12.2016");
        getGoON().click();

        return this;
    }

    public RegistrationPage dataChecking() {

        if (getSurnameZ().getAttribute("value").equals("Igor") && getNameZ().getAttribute("value").equals("Igor") &&
                getSurname().getAttribute("value").equals("Игорь") && getName().getAttribute("value").equals("Игорь") &&
                getMiddlename().getAttribute("value").equals("Игоревич") && getBirthDay().getAttribute("value").equals("01.05.1994") &&
                getSeriaP().getAttribute("value").equals("6789") && getNumberPassport().getAttribute("value").equals("123456") &&
                getIssuePlace().getAttribute("value").equals("Отделением") && getDataPassport().getAttribute("value").equals("22.12.2016")) {
            assertTrue("Все поля заполнены корректны", true);
        } else {
            assertTrue("Поля заполнены не корректны", false);
        }
        return this;
    }

    public RegistrationPage checkErorr() {

        assertTrue(getError().isDisplayed() && getError().getText().equals("Заполнены не все обязательные поля"));

        return this;
    }
}


