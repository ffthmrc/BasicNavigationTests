package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

public class Select_Dropdown {

    @Test

    public  void selectDropDown() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.facebook.com/");

        WebElement mountDropDown= driver.findElement(By.id("month"));
        Select mount_dd = new Select(mountDropDown);


         mount_dd.selectByIndex(3);   //it will select March
        Thread.sleep(3000);
        System.out.println(mount_dd.getFirstSelectedOption().getText());  // it'll write selected text  (Mar)


        mount_dd.selectByValue("10");     // it will select Oct
        Thread.sleep(3000);
        System.out.println(mount_dd.getFirstSelectedOption().getText());   // it'll write selected text  (Oct)


        mount_dd.selectByVisibleText("Aug");      // it will select Agust
        Thread.sleep(3000);
        System.out.println(mount_dd.getFirstSelectedOption().getText());    // it'll write selected text  (Aug)

        Thread.sleep(3000);
        driver.quit();



    }
}
