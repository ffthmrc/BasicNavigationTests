package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.BrowserFactory;


public class MouseOver {

    @Test
    public void mouse_OverTest(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/");
        driver.findElement(By.id("prependedInput")).sendKeys("User4");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).submit();
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Fleet"));
        action.moveToElement(element).build().perform();
         element = driver.findElement(By.linkText("Vehicles"));
        action.moveToElement(element).build().perform();
        element.click();
    }
}
