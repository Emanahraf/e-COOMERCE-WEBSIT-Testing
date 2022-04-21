package Pages;

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
        WebElement login= driver.findElement(IDelement);
        return login;
    }
    public WebElement LoginBtnElement1(WebDriver driver){
        By IDelement=By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
        WebElement login= driver.findElement(IDelement);
        return login;
    }
    public WebElement ForgetPasswordBtn(WebDriver driver){
        By IDelement=By.xpath("//span[@class=\"forgot-password\"]//a");
        WebElement Button= driver.findElement(IDelement);
        return Button;
    }


    public void LoginUser(WebDriver driver,String email ,String pass){
        EmailElement(driver).clear();
        EmailElement(driver).sendKeys(email);
        PasswordElement(driver).clear();
        PasswordElement(driver).sendKeys(pass);
       // LoginBtnElement(driver).sendKeys(Keys.ENTER);
    }

}
