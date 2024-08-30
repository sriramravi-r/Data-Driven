package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "signup")
    private WebElement signup_button;

    @FindBy(id = "firstName")
    private WebElement first_name;

    @FindBy(id = "lastName")
    private WebElement last_name;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submit")
    private WebElement submit_button;

    @FindBy(id = "cancel")
    private WebElement cancel_button;

    public void getSignup_button() {
        signup_button.click();
    }

    public void getFirst_name(String firstname) {
        first_name.sendKeys(firstname);
    }

    public void getLast_name(String lastname) {
        last_name.sendKeys(lastname);
    }

    public void getEmail(String e_mail) {
        email.sendKeys(e_mail);
    }

    public void getPassword(String pssword) {
        password.sendKeys(pssword);
    }

    public void getSubmit_button() {
        submit_button.click();
    }

    public void getCancel_button() {
        cancel_button.click();
    }
}
