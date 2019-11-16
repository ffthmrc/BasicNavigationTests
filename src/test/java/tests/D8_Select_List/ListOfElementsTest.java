package tests.D8_Select_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

import java.util.List;

public class ListOfElementsTest {

    @Test
    public void test2(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> list = driver.findElements(By.tagName("button"));
        System.out.println(list.size());

        for (WebElement each:list
             ) {

        }
    }
}
