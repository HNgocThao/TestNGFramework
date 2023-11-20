package hanhtester.testcases;

import hanhtester.commons.TestListener;
import hanhtester.pageObject.HomePage;
import hanhtester.pageObject.LoginPage;
import hanhtester.userActions.PageActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
@Listeners(TestListener.class)
public class UserAccessTest {
    private static WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }
    @Test
    public void Test_Login() {
        LoginPage.loadPage(driver);
        //driver.manage().window().maximize();
        PageActions.Login(driver, "Admin", "admin123");
        Assert.assertTrue(HomePage.text_Dashboard(driver).isDisplayed());
    }
    @Test
    public void Test_Logm(){
        PageActions.Show(driver);
    }
    @Test
    public void Test_Logout(){
        PageActions.Logout(driver);
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
