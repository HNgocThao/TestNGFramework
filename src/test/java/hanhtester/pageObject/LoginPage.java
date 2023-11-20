package hanhtester.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    private static WebElement element = null;
    //webdriver loads the page
    public static WebDriver loadPage(WebDriver driver) {
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        return driver;
    }
    //Text fields
    public static WebElement txtbx_UserName(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        return element;
    }
    public static WebElement txtbx_Password(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        return element;
    }
    // Buttons
    public static WebElement btn_Login(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }

}
