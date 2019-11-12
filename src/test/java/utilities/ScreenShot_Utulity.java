package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot_Utulity {

    public static void captureScreenShot(WebDriver driver,String screenshotName)  {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE); // this will take screenshot and it will keep in a memory
            FileUtils.copyFile(source, new File("./ScreenShot/"+screenshotName+".png"));
            System.out.println("Screenshot taken");
        }
        catch (Exception e){
            System.out.println("exeption while taking screenshot " + e.getMessage());
        }


    }

}
