package Assigmet2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleResultsTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        List<String> SearchStrs = Arrays.asList("java", "JUnit", "Selenium");
        for (int i = 0; i < SearchStrs.size(); i++) {
            WebElement search = driver.findElement(By.name("q"));
            String searchWord = SearchStrs.get(i);
            search.sendKeys(searchWord);
            WebElement searchEnter = driver.findElement(By.name("btnK"));
            search.submit(); // enter yapma isini goruyor
            //search.sendKeys(Keys.ENTER); // arama yapiyor ve sonra enter yapiyor
            if(SearchStrs.get(i)=="Selenium"){
                driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")).click();
                driver.navigate().back();
                driver.navigate().back();
                driver.quit();
            }
             driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
            driver.navigate().back();
            driver.navigate().back();
        }
        driver.quit();
    }
}
