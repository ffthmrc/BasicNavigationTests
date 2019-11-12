package VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserFactory;

import java.util.List;


public class VerfydefaultOrder {
    public static void main(String[] args) throws InterruptedException {

        //  Open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Go to Vytrack login page
        driver.get("https://qa2.vytrack.com/");
        //Login as any user

        driver.findElement(By.id("prependedInput")).sendKeys("User4", Keys.TAB,"UserUser123");
        //driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).submit();

       // driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
//        Select drpdwn = new Select(driver.findElement(By.className("fa-asterisk menu-icon")));
//        drpdwn.selectByVisibleText("Vehicles");
       // Go to Fleet -> Vehicles
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Fleet"));
        action.moveToElement(element).build().perform();
        element = driver.findElement(By.linkText("Vehicles"));
        action.moveToElement(element).build().perform();
        element.click();

        //




    }

}
