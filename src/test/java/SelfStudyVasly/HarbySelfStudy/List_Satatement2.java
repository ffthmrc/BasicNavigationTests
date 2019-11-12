package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

import java.util.List;

public class List_Satatement2 {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://practice.cybertekschool.com/");
        WebElement element = driver.findElement(By.xpath("//ul[@class='list-group']"));
        List<WebElement> lst = element.findElements(By.xpath(".//li"));
            int count =0;
        for(WebElement each : lst){

            String texts = each.getText();
            System.out.println(texts);
            count++;
        }
        System.out.println(count);
        driver.close();





    }
}
