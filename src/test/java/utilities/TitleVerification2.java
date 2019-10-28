package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com", " https://westelm.com/");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Dimension d = new Dimension(640,480);
        driver.manage().window().setSize(d);
        for (int i = 0 ; i < urls.size();i++){
            driver.get(urls.get(i));
            String url=driver.getCurrentUrl();
            //System.out.println(url);
            url=url.substring(url.indexOf(".")+1,url.lastIndexOf("."));
           // System.out.println(url);
            String title = driver.getTitle();
            String newtitle=title.replace(" ","").toLowerCase();
            //System.out.println(newtitle);
            boolean newtitle2 = newtitle.contains(url);
            System.out.println(newtitle2);
        }
        driver.close();
    }
}
