package amazon.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    //Page URL
    private static String PAGE_URL = "https://www.amazon.in/";
    private WebDriver driver;

    //Locators
    //SignIn Button
    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    private WebElement signInButton;
    //UserAvatar
//    @FindBy(xpath = "/html/body/div[1]/div[5]/main/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/a/img")
//    private WebElement userAvatar;

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

//    public String getNameOfLoggedInUser() {
//        return userAvatar.getText();
//    }
}
