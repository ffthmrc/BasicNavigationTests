package tests.d7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

public class RadioButtonTest {

    @Test
    public void Test1(){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
         driver.findElement(By.linkText("Radio Buttons")).click();


        WebElement blue = driver.findElement(By.id("blue"));
        WebElement red = driver.findElement(By.id("red"));
        System.out.println("Clicking on red");
        red.click();

        System.out.println("is blue selected: "+ blue.isSelected());
        System.out.println("is red selected: "+ red.isSelected());

        // verify if blue is selected
        Assert.assertFalse(blue.isSelected());
        // verify red is not selected
        Assert.assertTrue(red.isSelected());

    }
}
