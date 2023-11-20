package baiTapCodeGym.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ClientPage {
    public static void showClientPage(WebDriver driver){
        HomePage.text_Dashboard(driver).isDisplayed();
    }

    private static WebElement element = null;

    public static WebElement menu_Profile(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//span[@class='user-name ml10']"));
        return element;
    }
    public static WebElement menu_LogOut(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//a[text()=\" Sign Out\"]"));
        return element;
    }
}
