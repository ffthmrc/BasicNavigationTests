package Assigmet2Vassly;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class TestCase2 {

    public static void main(String[] args) {

        //Step 1. Go to https://practicecybertekschool.herokuapp.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");

       // Step 2. Verify that number of listed examples is equals to 48.
        WebElement element = driver.findElement(By.xpath("//ul[@class='list-group']"));
        List<WebElement> lst = element.findElements(By.xpath(".//li"));
        int count =0;
        for(WebElement each : lst){

            String texts = each.getText();
            System.out.println(texts);
            count++;
        }
        System.out.println(count);
       // System.out.println(c);
        boolean b1 = (count==48);
        System.out.println("Verify that number of listed examples is equals to 48 : " +b1);



    }
}
/*
List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='...']/ul/li"));
int s=allElements.size();
for(int i=1;i<=s;i++){
    allElements = driver.findElements(By.xpath("//div[@id='...']/ul/li"));
    allElements.get(i).click();
}
 */
/*
WebElement ul_element = driver.findElement(By.xpath("//ul[@class='list-unstyled']"));
        List<WebElement> li_All = ul_element.findElements(By.tagName("li"));
        System.out.println(li_All.size());
        for(int i = 0; i < li_All.size(); i++){
            System.out.println(li_All.get(i).getText());
        }
        //OR
        for(WebElement element : li_All){
            System.out.println(element.getText());
        }
 */
/*
List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='...']/ul/li"));
int s=allElements.size();
for(int i=1;i<=s;i++){
    allElements = driver.findElements(By.xpath("//div[@id='...']/ul/li"));
    allElements.get(i).click();
}
 */

/*
List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='...']/ul/li"));

for (WebElement element: allElements) {
      System.out.println(element.getText());
}
 */
