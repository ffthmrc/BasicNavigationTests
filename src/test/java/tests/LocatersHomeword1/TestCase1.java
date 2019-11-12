package tests.LocatersHomeword1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class TestCase1 {

    public static void main(String[] args) throws InterruptedException {
        /*
        Go to ebay
        enter search term
        click on search button
        print number of results
         */

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
        WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));

        search.sendKeys("term");
        driver.findElement(By.id("gh-btn")).click();
        WebElement result = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]/span[1]"));
        System.out.println(result.getText());

Thread.sleep(3000);
        driver.close();
    }
}
