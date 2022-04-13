package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetpasswordPage {

    public WebElement ForgetPasswordBtn(WebDriver driver){
        By IDelement=By.cssSelector("a[href=\"/passwordrecovery\"]");
        WebElement btn= driver.findElement(IDelement);
        return btn;
    }
    public WebElement ForgetPasswordemail(WebDriver driver){
        By IDelement=By.cssSelector("input[type=\"email\"]");
        WebElement email= driver.findElement(IDelement);
        return email;
    }
    public WebElement ForgetPasswordSubmit(WebDriver driver){
        By IDelement=By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
        WebElement Btn= driver.findElement(IDelement);
        return Btn;
    }
    public WebElement ForgetPassworMsg(WebDriver driver){
        By IDelement=By.className("content");
        WebElement msg= driver.findElement(IDelement);
        return msg;
    }
}
