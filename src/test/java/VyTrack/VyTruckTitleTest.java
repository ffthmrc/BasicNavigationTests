package VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class VyTruckTitleTest {
    public static void main(String[] args) throws InterruptedException {
      //  Open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    // Go to Vytrack login page
        driver.get("https://qa2.vytrack.com/");
    //Login as any user
        driver.findElement(By.id("prependedInput")).sendKeys("User4");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).submit();
    // Click on your name on top right
        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/a")).click(); // name.click
        Thread.sleep(1000);
     //Click on My Configuration
        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/ul/li[2]/a")).click(); // My Configurations
    // Verify that title start with the same name on top right
        Thread.sleep(1000);
        String title =driver.getTitle();
        System.out.println("Title " + title);
        String nameTitle = driver.findElement(By.xpath("//*[@id=\"user-menu\"]/a")).getText();
        System.out.println("Name title "+ nameTitle);
        boolean b1 = title.contains(nameTitle);
        System.out.println(b1);

        Thread.sleep(2000);


        driver.close();

    }
}
