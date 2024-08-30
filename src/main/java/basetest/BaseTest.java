package basetest;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest{

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
