package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import utilities.BrowserFactory;

public class Assert_IsSelected {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        try {
            AssertJUnit.assertTrue(driver.getTitle().contains("Google Search"));
            System.out.println("web Site Title is True");
        }
        catch (Error e){
            System.out.println("Web site Title is False");
        }


    }
}
