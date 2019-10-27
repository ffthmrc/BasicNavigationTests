package tests;

import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.StringUtility;

public class NavigationTests {

    public static void main(String[] args) {
       //firefox("firefox");
        chrome("chrome");
        //ie("ie");
    }

    public static void chrome(String browser){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://www.google.com");
        String gtitle=driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String etitle = driver.getTitle();
        driver.navigate().back();

        StringUtility.verifyEquals(gtitle,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(etitle,driver.getTitle());

        driver.close();
    }

    public static void firefox(String browser){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://www.google.com");
        driver.close();
    }
    public static void safari(String browser){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://www.google.com");
    }
    public static void ie(String browser){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://www.amazon.com");
        String  gtitle = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        // driver.get("https://etsy.com");
        String etitle1 = driver.getTitle();
        driver.navigate().back();
    }

}
