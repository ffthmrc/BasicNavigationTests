package VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class VerfydefaultOrder {
    public static void main(String[] args) throws InterruptedException {

        //  Open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Go to Vytrack login page
        driver.get("https://qa2.vytrack.com/");
        //Login as any user
        driver.findElement(By.id("prependedInput")).sendKeys("User4");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).submit();

       // driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
//        Select drpdwn = new Select(driver.findElement(By.className("fa-asterisk menu-icon")));
//        drpdwn.selectByVisibleText("Vehicles");

        
        Thread.sleep(2000);
        driver.findElement(By.linkText("Vehicles")).click();
    }

}
