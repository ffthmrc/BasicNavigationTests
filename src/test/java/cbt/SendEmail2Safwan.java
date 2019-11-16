package cbt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendEmail2Safwan {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //Dimension d = new Dimension(640,480);
        driver.manage().window().maximize();
        driver.get("http://gmail.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("identifierId")).sendKeys("fatihmeric06@gmail.com");
        WebElement next = driver.findElement(By.className("CwaK9"));
        next.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("****");
        WebElement passwordnext = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
        passwordnext.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement compose = driver.findElement(By.xpath("//*[@id=\":j5\"]/div/div"));
        compose.click();

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.id(":oq")).sendKeys("fatihmeric06@gmail.com");

        driver.findElement(By.id(":o8")).sendKeys("New Email try");
        driver.findElement(By.id(":pd")).sendKeys("Dear ferhat ;  Today you tried send email.");

        WebElement send = driver.findElement(By.id(":ny"));
        send.click();

        driver.close();

    }
}
