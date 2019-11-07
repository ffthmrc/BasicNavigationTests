package Practice.Cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    public static void main(String[] args) {

    //Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement AB = driver.findElement(By.xpath("//li[@class='list-group-item']//*[text()='A/B Testing']"));

        new Actions(driver).moveToElement(AB).keyDown(Keys.ALT).contextClick().keyUp(Keys.ALT).perform();
}}