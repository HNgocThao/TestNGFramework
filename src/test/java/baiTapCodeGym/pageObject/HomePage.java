package baiTapCodeGym.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class HomePage {

    public static void Login(WebDriver driver) {
        LoginPage.loginPage(driver);
        LoginPage.click_Id(driver).click();
        LoginPage.btn_Login(driver).click();
    }

    private static WebElement element = null;
    //menu
    public static WebElement text_Dashboard(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//span[text()='Dashboard']"));
        return element;
    }

}
