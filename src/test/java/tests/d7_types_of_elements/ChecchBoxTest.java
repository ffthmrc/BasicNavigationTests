package tests.d7_types_of_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

public class ChecchBoxTest {

    @Test

    public void checkBoxTest(){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");


        WebElement one = driver.findElement(By.xpath("//input[1]"));
        WebElement two = driver.findElement(By.xpath("//input[2]"));

        System.out.println("One is selected :" + one.isSelected());
        System.out.println("Two is selected :" + two.isSelected());

        // Verify one is not selected
        Assert.assertFalse(one.isSelected());
        //Verify two is selected
        Assert.assertTrue(two.isSelected());
    }
}
