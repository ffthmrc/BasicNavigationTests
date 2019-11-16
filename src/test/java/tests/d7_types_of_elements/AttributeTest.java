package tests.d7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

public class AttributeTest {

    @Test
    public void test1() {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));
        blue.getAttribute("name");
        System.out.println(blue.getAttribute("name"));
        System.out.println(blue.getAttribute("innerHTML"));
    }
}