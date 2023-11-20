package baiTapCodeGym.testcases;

import baiTapCodeGym.pageObject.ClientPage;
import baiTapCodeGym.pageObject.HomePage;
import baiTapCodeGym.userActions.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ClientTest extends TestBase{
    private WebDriver driver;

    @BeforeClass
    public void beforeTestMethod() {
//        driver = new ChromeDriver();
//        LoginPage.loginPage(driver);
//        driver.get(baseURL);
    }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @Test(description = "Verify the login function")
    public void aTest_Login() {
        HomePage.Login(driver);
    }
    @Test
    public void bTest_Show(){
        ClientPage.showClientPage(driver);
        Assert.assertTrue(HomePage.text_Dashboard(driver).isDisplayed());
    }
    @Test
    public void cTest_Logout(){
        PageActions.clickClientPage(driver);
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
