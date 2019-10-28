package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriverManager.chromedriver().setup();
        //Open chrome browser
        WebDriver driver = new ChromeDriver();
        //Visit all the websites from step 3 and verify that they all have the same title
        String homeTitle="";
        boolean startUrl=false;
        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            Thread.sleep(1000);

            homeTitle = driver.getTitle();
            if(homeTitle.equals(driver.getTitle())){
                homeTitle="Same title";
            }
            //Verify that all URLs of all pages start with http://practice.cybertekschool.com .
            String url = driver.getCurrentUrl();
            if(startUrl=url.startsWith("http://practice.cybertekschool.com")){
                startUrl=true;
            }
        }
        System.out.println("URLs of all pages start with http://practice.cybertekschool.com "+startUrl);
        System.out.println("Title name : " + homeTitle);
        driver.close();
    }
}
