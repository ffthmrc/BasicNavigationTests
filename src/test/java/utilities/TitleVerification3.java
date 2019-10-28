package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/", "https://wayfair.com/",
                "https://walmart.com", " https://westelm.com/");

            for (int i = 0; i < urls.size(); i++) {
                driver.get(urls.get(i));
            }
            driver.quit();


    }
}
