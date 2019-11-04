package utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class initialChrome {
    public static void initialChrome(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        Dimension d = new Dimension(640,480);
        driver.manage().window().setSize(d);
    }
}
