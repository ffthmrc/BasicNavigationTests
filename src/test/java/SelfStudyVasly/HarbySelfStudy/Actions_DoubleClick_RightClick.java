package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

public class Actions_DoubleClick_RightClick {
@Test
    public void double_clickTest() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.tripadvisor.com/Airline_Review-d10823595-Reviews-Borajet-No-Longer-Operating");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("global-nav-flights"));
        actions.contextClick(element).build().perform();
        WebElement doubleclick = driver.findElement(By.xpath("//h1[@class='flights-airline-review-page-airline-review-header-AirlineDetailHeader__airlineName--2JeT1']"));
        actions.doubleClick(doubleclick).doubleClick().perform();

    Thread.sleep(3000);
    }

    @Test
    public  void right_clickTest() throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.tripadvisor.com/Airline_Review-d10823595-Reviews-Borajet-No-Longer-Operating");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("global-nav-flights"));
        actions.contextClick(element).build().perform();

        Thread.sleep(3000);

    }


}
