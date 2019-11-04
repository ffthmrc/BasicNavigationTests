package Assigmet2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearchTest {
    public static void main(String[] args) throws InterruptedException {
// 1-2.open Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        //driver.manage().window().maximize();
//3. Search for wooden spoon
        WebElement search = driver.findElement(By.name("_nkw"));
        String item = "wooden spoon";
       // Thread.sleep(1000);
        search.sendKeys(item);
        search.submit();
 //4.Save the total number of results
        String element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]")).getText();
        System.out.println("Wooden Spoon result "+element.substring(element.indexOf("11,")));
//5. Click on link All
         driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/a/span")).click();
Thread.sleep(1000);
driver.navigate().refresh();
         //.Save the  number of All results
       String allurement = driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println("All element: "+allurement);
       // int num3=Integer.parseInt(element);
        //int num4=Integer.parseInt(allurement);
       // System.out.println(num3+" "+num4);
//7.Navigate back to previous research results page
       // if(num3<num4){
    driver.navigate().back();
       // }
        String wooden =driver.findElement(By.id("gh-ac")).getText();
       boolean b1= wooden.equals("wooden spoon");
        System.out.println(b1);
        driver.navigate().refresh();
        Thread.sleep(2000);
        WebElement home= driver.findElement(By.id("gh-la"));
        home.click();
        WebElement search2 = driver.findElement(By.name("_nkw"));
            boolean b8=search2.getText().isEmpty();
        System.out.println(b8);
       // search.sendKeys(Keys.ENTER);
     driver.quit();
    }
}
