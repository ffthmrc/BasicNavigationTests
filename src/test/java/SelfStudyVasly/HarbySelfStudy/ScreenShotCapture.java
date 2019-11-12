package SelfStudyVasly.HarbySelfStudy;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.BrowserFactory;



public class ScreenShotCapture {


@Test
    public void CaptureScreenShot() {

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    utilities.ScreenShot_Utulity.captureScreenShot(driver,"facebook1");
        driver.findElement(By.id("emailewtwrtw")).sendKeys("Learn Automation");
        //  take a screenshoot


    }

    @AfterMethod
    public void tearDown(ITestResult result){
        WebDriver driver = BrowserFactory.getDriver("firefox");
    if(ITestResult.FAILURE==result.getStatus()){

    utilities.ScreenShot_Utulity.captureScreenShot(driver,result.getName());
}
driver.quit();
    }
}
