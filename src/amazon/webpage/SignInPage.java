package amazon.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private WebDriver driver;

    //Locators
    @FindBy(xpath = "//*[@id=\"shipaddress\"]/div[3]/div/div[2]/div/div[1]/div/h3")
    private WebElement orderheading;
    @FindBy(xpath = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
    private WebElement orderButton;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    private WebElement loginheading;
    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[1]/label")
    private WebElement emailheading;

    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/form/div/div[1]/div[1]/div[1]/label")
    private WebElement passwordheading;


    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement emailContinue;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    private WebElement passwordContinue;


    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    private WebElement cart;

//    @FindBy(xpath = "//*[@id=\"js-flash-container\"]/div/div/div")
//    private WebElement signInError;

   //Constructor
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }



    public void setEmail(String usersEmail) {

        email.clear();
        email.sendKeys(usersEmail);
        emailContinue.click();

    }
    public void setPassword(String usersPassword) {

        password.clear();
        password.sendKeys(usersPassword);
        passwordContinue.click();

    }

    //Check if page is opened
    public boolean isEmailPageOpened() {
        return emailheading.getText().contains("Email or mobile phone number");
    }
    public boolean isPasswordPageOpened() {
        return passwordheading.getText().contains("Password");
    }

    public boolean isLogined() {
        return loginheading.getText().contains("नमस्ते, abhay");
    }

    public boolean isOrderPlaced(){
        return orderheading.getText().contains("डिलीवरी का पता चुनें");
    }

    public void gotoCart(){
        cart.click();

    }

    public void placeOrder(){
        orderButton.click();
    }





//    public boolean errorMessageIsVisible() {
//        return signInError.isDisplayed();
//    }
}
