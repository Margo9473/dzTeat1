import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePages;
import pages.StartPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class RulSber {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "http://www.sberbank.ru/ru/person";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public StartPage goToMainPage() {
        driver.get(baseUrl + "/");
        return PageFactory.initElements(driver, StartPage.class);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
