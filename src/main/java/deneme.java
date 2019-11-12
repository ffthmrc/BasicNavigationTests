import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class deneme {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.amazon.com");
Thread.sleep(1000);
      driver.navigate().refresh();
        driver.get("http://www.google.com");
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.close();
    }
}
