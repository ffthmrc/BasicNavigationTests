package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

import java.util.List;

public class List_Statement_ONEMLI {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.haberturk.com//");

        Thread.sleep(5000);
        // Tum tag nameleri elemente atadik
        WebElement element = driver.findElement(By.xpath(".//*"));
        // Butun 'a' tagnamelerini lst ye atadik
        List<WebElement> lst = driver.findElements(By.tagName("a"));
        System.out.println(lst.size());
        for (WebElement webelement : lst){
            String url = webelement.getAttribute("href");
            String[] urls = new String[] {url};

            for (int i =0; i<urls.length;i++){
                System.out.println(urls[i]);
            }




        }






    }
}
