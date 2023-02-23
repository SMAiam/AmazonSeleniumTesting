import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class URLValidation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        int length = driver.getTitle().length();
        System.out.println("Title of the webpage is: " + title);
        System.out.println("Length of the title is: " + length);

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        if (actualUrl.equals("https://www.google.com/")) {
            System.out.println("Verification successful");
        } else {
            System.out.println("Verification failed");
        }
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Page source length: " + pageSourceLength);

    }
}
