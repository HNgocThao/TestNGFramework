package hanhtester.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class HomePage {
    private static WebElement element = null;
    //menu
    public static WebElement text_Dashboard(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        return element;
    }
    public static WebElement menu_Profile(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
        return element;
    }
    public static WebElement menu_LogOut(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.linkText("Logout"));
        return element;
    }
}

