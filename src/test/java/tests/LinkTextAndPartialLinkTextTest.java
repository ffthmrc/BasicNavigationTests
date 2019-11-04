package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class LinkTextAndPartialLinkTextTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        Dimension d = new Dimension(640,480);
        driver.manage().window().setSize(d);
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement  link = driver.findElement(By.linkText("Example 6: Loading overlay that disappears and disappears again"));
        System.out.println(link.getText());

        WebElement linkagain = driver.findElement(By.partialLinkText("Example 6"));
        System.out.println("partialLink  " + linkagain.getText());
    }
}
