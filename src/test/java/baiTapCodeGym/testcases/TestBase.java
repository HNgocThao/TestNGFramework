package baiTapCodeGym.testcases;

import baiTapCodeGym.commons.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.util.Objects;
@Listeners(TestListener.class)
public class TestBase {
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = getWebDriverInstance();
    }


    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    /**
     * Init WebDriver
     */
    public WebDriver getWebDriverInstance() {
        return Objects.nonNull(driver)? driver: new ChromeDriver(configChromeOption());
    }

    /**
     * Config Chrome Option
     */
    public ChromeOptions configChromeOption() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        return chromeOptions;
    }

}
