package SelfStudyVasly.HarbySelfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
       WebElement seyfo =  driver.findElement(By.xpath("//input[@id='search']"));
       seyfo.sendKeys("How to push an Eclipse project to GitHub? By Master Muhtar");
        seyfo.submit();
        WebElement video = driver.findElement(By.xpath("//a[@title='How to push an Eclipse project to GitHub? By Master Muhtar']"));
        System.out.println(video.getText());
        video.click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='search_query']")).clear();

       // driver.close();
    }
}