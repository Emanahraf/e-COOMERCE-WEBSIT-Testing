import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebElement EmailElement(WebDriver driver){
        By IDelement= By.id("Email");
        WebElement Email= driver.findElement(IDelement);
        return Email;
    }
    public WebElement PasswordElement(WebDriver driver){
        By IDelement=By.id("Password");
        WebElement Pass= driver.findElement(IDelement);
        return Pass;
    }
    public WebElement LoginBtnElement(WebDriver driver){
        By IDelement=By.cssSelector("button[class=\"button-1 login-button\"]");
        WebElement Button= driver.findElement(IDelement);
        return Button;
    }
    public WebElement ForgetPasswordBtn(WebDriver driver){
        By IDelement=By.xpath("//span[@class=\"forgot-password\"]//a");
        WebElement Button= driver.findElement(IDelement);
        return Button;
    }
//forget password element i need to make new pom page
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
    public void LoginUser(WebDriver driver,String email ,String pass){
        EmailElement(driver).clear();
        EmailElement(driver).sendKeys(email);
        PasswordElement(driver).clear();
        PasswordElement(driver).sendKeys(pass);
        LoginBtnElement(driver).sendKeys(Keys.ENTER);
    }

}
