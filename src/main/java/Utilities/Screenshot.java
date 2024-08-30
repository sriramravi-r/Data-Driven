package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {
    public static void screenshot(WebDriver driver,String testname){
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String timestamp=new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        File dis=new File("C:\\Users\\LENOVO\\Downloads\\Automation notes\\contact_list_app\\src\\main\\java\\Screenshots\\"+testname+" "+timestamp+".png");
        try {
            FileUtils.copyFile(src,dis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
