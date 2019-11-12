package tests.D5_xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

import java.util.List;

public class XpathTestDemoClass {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement link = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        System.out.println(link.getText());


        String button = driver.findElement(By.xpath("/html/body/div/div/div/div/h3")).getText();
        System.out.println(button);
        link.sendKeys(Keys.chord(Keys.ALT, Keys.ARROW_LEFT));
        //driver.findElement(By.xpath("//button[@onclick='button()']"));
    }
}
