package tests.LocatersHomeword1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class TestCase2 {
    /*
    go to amazon
    Go to ebay
    enter search term
    click on search button
    verify title contains search term
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com");
        WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        search.sendKeys("term");
        driver.findElement(By.id("gh-btn")).click();
        String termtitle= driver.getTitle();
        boolean b1= termtitle.contains("term");
        System.out.println(b1);

        Thread.sleep(3000);
        driver.close();

    }
}
