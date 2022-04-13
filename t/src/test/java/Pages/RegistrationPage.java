package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    String validemail="eman123@baianat.com";
    String validpass="EMANASHRAF@2020";
    public WebElement RegBtn(WebDriver driver){
        By IDelement=By.cssSelector("button[class=\"button-1 register-button\"]");
        WebElement RegButton= driver.findElement(IDelement);
        return RegButton;
    }
    public WebElement RegBtn1(WebDriver driver){
        By IDelement=By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");
        WebElement RegButton= driver.findElement(IDelement);
        return RegButton;
    }

    public WebElement FirstName(WebDriver driver){
        By IDelement=By.cssSelector("input[id=\"FirstName\"]");
        WebElement FirstName= driver.findElement(IDelement);
        return FirstName;
    }
    public WebElement LastName(WebDriver driver){
        By IDelement=By.cssSelector("input[id=\"LastName\"]");
        WebElement LastName= driver.findElement(IDelement);
        return LastName;
    }

    public WebElement Regemail(WebDriver driver){
        By IDelement=By.cssSelector("input[type=\"email\"]");
        WebElement email= driver.findElement(IDelement);
        return email;
    }

    public WebElement Regpass(WebDriver driver){
        By IDelement=By.id("Password");
        WebElement pass= driver.findElement(IDelement);
        return pass;
    }
    public WebElement Logout(WebDriver driver){
        By IDelement=By.cssSelector("a[href=\"/logout\"]");
        WebElement pass= driver.findElement(IDelement);
        return pass;
    }
    public WebElement RegpassConfirm(WebDriver driver){
        By IDelement=By.id("ConfirmPassword");
        WebElement pass= driver.findElement(IDelement);
        return pass;
    }
    public WebElement RegConfirmBtn(WebDriver driver){
        By IDelement=By.id("register-button");
        WebElement btn= driver.findElement(IDelement);
        return btn;
    }
    public WebElement RegConMsg(WebDriver driver){
        By IDelement=By.className("result");
        WebElement Msg= driver.findElement(IDelement);
        return Msg;
    }
    public WebElement Cofirm(WebDriver driver){
        By IDelement=By.cssSelector("a[class=\"button-1 register-continue-button\"]");
        WebElement btn= driver.findElement(IDelement);
        return btn;
    }

}
