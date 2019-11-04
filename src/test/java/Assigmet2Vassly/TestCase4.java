package Assigmet2Vassly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
    public static void main(String[] args) {
        //Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
    //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
     //Step 3. Enter “123” into first name input box.
     driver.findElement(By.name("firstname")).sendKeys("123");
     //Step 4. Verify that warning message is displayed: “first name can only consist of alphabetical letters”
    String message = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[3]")).getText();
    boolean b1 = message.equals("first name can only consist of alphabetical letters");
        System.out.println(b1);

        driver.close();
    }
}
