package github.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private WebDriver driver;

    //Locators

    @FindBy(xpath = "//*[@id=\"login\"]/div[1]/h1")
    private WebElement heading;


    @FindBy(xpath = "//*[@id=\"login\"]/div[4]/form/div/input[11]")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"login_field\"]")
    private WebElement userEmail;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"js-flash-container\"]/div/div/div")
    private WebElement signInError;

    //Constructor
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void setUserEmail(String usersEmail) {
        userEmail.clear();
        userEmail.sendKeys(usersEmail);
    }

    public void setUserPassword(String usersPassword) {
        password.clear();
        password.sendKeys(usersPassword);
    }

    public void signIn(String usersEmail, String password) {
        if (isPageOpened()) {
            setUserEmail(usersEmail);
            setUserPassword(password);
            clickOnSubmit();
        }
    }
    //Check if page is opened
    public boolean isPageOpened() {
        return heading.getText().contains("Sign in to GitHub");
    }

    public void clickOnSubmit() {
        submitButton.click();
    }

    public boolean errorMessageIsVisible() {
        return signInError.isDisplayed();
    }
}
