package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

import java.util.List;

public class Selecte_Dropdown_List {

    @Test

    public  void selectDropDown()  {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.facebook.com/");
        driver.manage().window().setPosition(new Point(400,0));

        WebElement mountDropDown = driver.findElement(By.id("month"));
        Select mount_dd = new Select(mountDropDown);

        List<WebElement> mounth_list = mount_dd.getOptions();
        int totalmounth = mounth_list.size();

        Assert.assertEquals(totalmounth,13); // if this Assert is not true test failed

        System.out.println("Total mounth is : " + totalmounth);

        for ( WebElement ele: mounth_list){
            String mounthName = ele.getText();

            System.out.println(mounthName);
        }




    }

}
