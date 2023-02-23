package amazon.test;

import amazon.webpage.HomePage;
import amazon.webpage.SignInPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInPageTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        //Use Chrome driver
        driver = new ChromeDriver();
        //full screen window
        driver.manage().window().maximize();
        // wait for the element to appear before the exception occurs
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testSignInWithValidCredentials() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        //Create object of SignInPage
        SignInPage signInPage = new SignInPage(driver);
        //Check if page is opened

          Assert.assertTrue(signInPage.isEmailPageOpened());
          signInPage.setEmail("mayankkant01@gmail.com");
          Assert.assertTrue(signInPage.isPasswordPageOpened());
          signInPage.setPassword("1234567A");
          Assert.assertTrue(signInPage.isLogined());
          signInPage.gotoCart();
          signInPage.placeOrder();
          Assert.assertTrue(signInPage.isOrderPlaced());

        //Verifying whether user is logged in
        //Assert.assertEquals("Ania-Duldiier", homePage.getNameOfLoggedInUser());
    }



    @After
    public void tearDown() {
        driver.quit();
    }
}
