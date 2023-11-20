package hanhtester.userActions;

import hanhtester.pageObject.HomePage;
import hanhtester.pageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageActions {
    public static void Login(WebDriver driver , String username, String password) {
        LoginPage.loadPage(driver);
        LoginPage.txtbx_UserName(driver).sendKeys(username);
        LoginPage.txtbx_Password(driver).sendKeys(password);
        LoginPage.btn_Login(driver).click();
    }
    public static void Show(WebDriver driver){
        HomePage.text_Dashboard(driver).isDisplayed();
//        HomePage.menu_Profile(driver).click();
//        HomePage.menu_LogOut(driver).click();
    }
    public static void Logout(WebDriver driver){
//        HomePage.text_Dashboard(driver).isDisplayed();
        HomePage.menu_Profile(driver).click();
        HomePage.menu_LogOut(driver).click();
    }

}
