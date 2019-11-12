package Assigmet2Vassly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
    //Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().clearPreferences(); // google ' da gelen guncellemeleri otomatik guncelliyor.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");

     //Step 2. Click on “Sign Up For Mailing List”
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        //Thread.sleep(3000);


    //Step 3. Enter any valid name
        driver.findElement(By.name("full_name")).sendKeys("lordmenx");
    //Step 4. Enter any valid email
        driver.findElement(By.name("email")).sendKeys("bedretkurza234@gmail.com");
    //Step 5. Click on “Sign Up” button
        driver.findElement(By.name("wooden_spoon")).click();
    // Expected result: Following message should be displayed:
    // “Thank you for signing up. Click the button below to return to the home page.”
    // Home button should be displayed.

        String message = driver.findElement(By.name("signup_message")).getText();
        System.out.println("Actual message : " +message);

        boolean b1 = message.equals(" you for signing up. Click the button below to return to the home page.");
        System.out.println("Message status : " + b1);

        WebElement homeButton = driver.findElement(By.id("wooden_spoon"));
        try{
            if(homeButton.isDisplayed()){
                System.out.println("HomeButton is displayed");
                homeButton.click();
            }
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
        }
        driver.close();

    }
}
