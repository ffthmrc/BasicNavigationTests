package Assigmet2Vassly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase8 {
    public static void main(String[] args) {
//Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
        //Step 3. Enter “5711234354” into phone number input box.
        driver.findElement(By.name("phone")).sendKeys("5711234354");
     //Step 4. Verify that warning message is displayed: “Phone format is not correct”
        String message  = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/small[2]")).getText();
        System.out.println(message);
        boolean b1 = message.equals("Phone format is not correct");
        System.out.println(b1);

            driver.close();
    }
}
