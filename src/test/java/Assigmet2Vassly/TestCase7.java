package Assigmet2Vassly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {
    public static void main(String[] args) {

        //Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
        //Step 3. Enter “testers@email” into email input box.
        driver.findElement(By.name("email")).sendKeys("testers@email");
        //Step 4. Verify that warning message is displayed:
        // “email address is not a valid
        // Email format is not correct”
       String message = "";
        for (int i=2; i<4;i++) {
            message+=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/small["+i+"]")).getText()+" ";
        }
        System.out.println(message);
        boolean b1 = message.trim().equals("email address is not a valid Email format is not correct");
        System.out.println(b1);

            driver.close();

    }
}
