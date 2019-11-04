package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class ClassName_locater {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        Dimension d = new Dimension(640,480);
        driver.manage().window().setSize(d);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement element = driver.findElement(By.className("h3"));
        System.out.println(element.getText());

    }
}
