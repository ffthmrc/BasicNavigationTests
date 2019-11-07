package SelfStudyVasly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorID {
    /*
    <div id="btn">Hello world!</div>

    WebElement element = driver.findElement(By.id."btn'));
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com");
        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        btn1.click();
        String expected = "I'm Feeling Lucky";
        String actual = btn1.getAttribute("value");
        if(actual.equals(expected)){
            System.out.println("Passed");
        } else {
            System.out.println("failed");
            System.out.println("Expected text :" + expected);
            System.out.println("Actual text :" + actual);
        }
        Thread.sleep(2000);
        driver.close();
    }

}
