package baiTapCodeGym.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    private static WebElement element = null;
    //webdriver loads the page
    public static WebDriver loginPage(WebDriver driver) {
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rise.fairsketch.com");
        return driver;
    }
    //click id
    public static WebElement click_Id(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//div[@class='box p10 clickable fill-login b-b' and position()=3]"));
        return element;
    }
    // Buttons
    public static WebElement btn_Login(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }
}
