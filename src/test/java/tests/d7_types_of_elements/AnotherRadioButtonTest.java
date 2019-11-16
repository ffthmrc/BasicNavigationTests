package tests.d7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

public class AnotherRadioButtonTest {

    @Test
    public void test1(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");


        WebElement basketball = driver.findElement(By.id("basketball"));
        WebElement football = driver.findElement(By.id("football"));

        // verify if both radio buttons NOT selected
        Assert.assertFalse(basketball.isSelected());

        Assert.assertFalse(football.isSelected());




    }
}
