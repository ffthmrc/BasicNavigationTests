package Assigmet2Vassly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {
    public static void main(String[] args) {
        //Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
        //Step 3. Enter “user” into last name input box.
        driver.findElement(By.name("username")).sendKeys("user");
        //Step 4. Verify that warning message is displayed: “The username must be more than 6 and less than 30 characters long”
        String message = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/small[2]")).getText();
        boolean b1 = message.equals("The username must be more than 6 and less than 30 characters long");
        System.out.println(b1);


            driver.close();
    }
}
