package Assigmet2Vassly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) {
     //Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");

    //Step 2. Click on “Multiple Buttons”
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
    //Step 3. Click on “Button 1”
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[1]")).click();
    //Verify that result message is displayed: “Clicked on button one!”
    String result = driver.findElement(By.id("result")).getText();
    boolean b1 = result.equals("Clicked on button one!");
        System.out.println(b1);
    }
}
