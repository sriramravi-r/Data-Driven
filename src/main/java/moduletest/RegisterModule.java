package moduletest;

import basetest.BaseTest;
import org.testng.annotations.Test;
import page.RegisterPage;

import static Utilities.ExcelReader.dataReader;
import static Utilities.Properties.propertyreader;
import static Utilities.Screenshot.screenshot;

public class RegisterModule extends BaseTest {
    @Test
    public void registerModule() throws InterruptedException {
        driver.get(propertyreader("BASE_URL"));
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.getSignup_button();
        registerPage.getFirst_name(dataReader(1,0));
        registerPage.getLast_name(dataReader(1,1));
        registerPage.getEmail(dataReader(1,2));
        registerPage.getPassword(dataReader(1,3));
        registerPage.getSubmit_button();
        Thread.sleep(3000);
        screenshot(driver,"registerModule");
    }
}
