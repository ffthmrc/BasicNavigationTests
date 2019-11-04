package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class d4_basic_locaters {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Dimension d = new Dimension(640,480);
        driver.manage().window().setSize(d);

        WebElement element = driver.findElement(By.id("disappearing_button"));
        String text = element.getText();
        System.out.println(text);
        element.click();

driver.quit();
    }
}
