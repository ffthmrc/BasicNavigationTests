package Assigmet2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearchTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        //driver.manage().window().maximize();

        WebElement search = driver.findElement(By.name("_nkw"));
        String item = "wooden spoon";
       // Thread.sleep(1000);
        search.sendKeys(item);
        search.submit();
        WebElement element = driver.findElement(By.id("11,450"));
        System.out.println(element.getText());
       // search.sendKeys(Keys.ENTER);

    }
}
