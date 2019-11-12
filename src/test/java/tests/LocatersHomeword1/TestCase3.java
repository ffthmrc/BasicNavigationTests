package tests.LocatersHomeword1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class TestCase3 {
    /*
        Go to wikipedia.org (Links to an external site.)
        enter search term `selenium webdriver`
        click on search button
        click on search result `Selenium (software)`
        verify url ends with `Selenium_(software)`
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        WebElement search = driver.findElement(By.id("searchInput"));
              search.sendKeys("selenium webdriver");
        search.sendKeys(Keys.ENTER);
        //click on search result `Selenium (software)`
         driver.findElement(By.xpath("//a[@title='Selenium (software)']")).click();
      //   verify url ends with `Selenium_(software)`
         boolean b1 =  driver.getCurrentUrl().endsWith("Selenium_(software)");
        System.out.println(b1);
        Thread.sleep(3000);
      // driver.close();
    }
}
