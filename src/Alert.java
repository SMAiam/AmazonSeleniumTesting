import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("Sam");
        driver.findElement(By.name("submit")).submit();

        org.openqa.selenium.Alert alert = driver.switchTo().alert();

        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        //Thread.sleep(5000);

        alert.accept();
        //alert.dismiss();
    }
}
