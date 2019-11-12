package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class IsSelected {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://www.qaclickacademy.com/practice.php");
        WebElement element = driver.findElement(By.xpath("//*[@value='radio1']"));
        element.click();
        String b1 = element.isSelected()? "Radio1 is selected": "Radio1 is not selected";
        System.out.println(b1);





    }
}
