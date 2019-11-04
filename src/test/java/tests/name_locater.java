package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class name_locater {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        Dimension d = new Dimension(640,480);
        driver.manage().window().setSize(d);
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullname = driver.findElement(By.name("full_name"));
        fullname.sendKeys("fatih meric");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("asd@gmail.com");

        WebElement submitButton = driver.findElement(By.name("wooden_spoon"));
        submitButton.click();


        driver.quit();


    }
}
