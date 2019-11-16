package Assigmet2Vassly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

import java.util.List;

public class Loop_All_Button {

    @BeforeClass
    public void beforeMethod(String browser,String url){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get(url);

    }


    @Test
    public void allButton(){
beforeMethod("chrome","http://practice.cybertekschool.com/");
        WebDriver driver = null;
       // WebElement element = driver.findElement(By.xpath("//div/ul"));
        List<WebElement> lst = driver.findElements(By.xpath("//div/ul/li[*]/a"));
        for (WebElement each: lst){
        }




    }
}
