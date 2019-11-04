package VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VytrackShortcutFunctionality {
    public static void main(String[] args) throws InterruptedException {
     // Open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    //Go to Vytrack login page
        driver.get("https://qa2.vytrack.com/user/login");
    //Login as a sales manager
        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager104");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).submit();

        // Verify Dashboard page is open
        String dashborTitle = driver.getTitle();
        boolean b1 = dashborTitle.equals("Dashboard");
        System.out.println(b1);
        Thread.sleep(1000);

        //Click on Shortcuts icon
        driver.findElement(By.className("fa-share-square")).click();

        //Click on link See full list
        driver.findElement(By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/div[2]/div/ul/li[2]/form/div/div/a")).click();

        //Click on link Opportunities
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/table/tbody/tr[4]/td[1]/a")).click();

        //Verify Open opportunities page is open
        Thread.sleep(1000);
        String ByOppTitle = driver.getTitle();
        boolean b2 = ByOppTitle.contains("By Opportunities");
        System.out.println(b2);

        //Click on Shortcuts icon
        Thread.sleep(1000);
        driver.findElement(By.className("fa-share-square")).click();

        //Click on link See full list
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/div[2]/div/ul/li[2]/form/div/div/a")).click();

        //Click on link Vehicle Service Logs
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/table/tbody/tr[17]/td[1]/a")).click();
        String Vehiclelink = driver.getCurrentUrl();

        //Verify error message text is You do not have permission to perform this action.
        Thread.sleep(1000);
       WebElement error = driver.findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div/div"));
        //String errorTitle = error.getAttribute("class");
        //System.out.println("VAlue of the class " + errorTitle);

        String deneme = driver.findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div/div")).getText();
        System.out.println("Error message is : " +deneme);

        boolean b3 = deneme.equals("You do not have permission to perform this action.");
        System.out.println("error message text is " + b3);

        //Verify Shortcut Actions List page is still open
        boolean b4 = driver.getCurrentUrl().equals(Vehiclelink);
        System.out.println("Shortcut Actions List page is still open " +b4);

    driver.close();

    }
}
