package Assigmet2Vassly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
    @Test
    public void testcase2(){
     //Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");

    //Step 2. Click on “Multiple Buttons”
        driver.findElement(By.linkText("Multiple Buttons")).click();
    //Step 3. Click on “Button 1”
        driver.findElement(By.xpath("//button[@onclick='button1()']")).click();
    //Verify that result message is displayed: “Clicked on button one!”

    WebElement result = driver.findElement(By.id("result"));
        String resulttext =    result .getText();
    boolean b1 = result.equals("Clicked on button one!");
       System.out.println(b1);
    }
}
