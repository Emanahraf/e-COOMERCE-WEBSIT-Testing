import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    public WebElement Country(WebDriver driver){
        By IDelement=By.cssSelector("select[data-trigger=\"country-select\"]");
        WebElement C= driver.findElement(IDelement);
        return C;
    }
    public WebElement City(WebDriver driver){
        By IDelement=By.id("BillingNewAddress_City");
        WebElement C= driver.findElement(IDelement);
        return C;
    }

    public WebElement Add1(WebDriver driver){
        By IDelement=By.id("BillingNewAddress_Address1");
        WebElement a= driver.findElement(IDelement);
        return a;
    }
    public WebElement Add2(WebDriver driver){
        By IDelement=By.id("BillingNewAddress_Address2");
        WebElement a= driver.findElement(IDelement);
        return a;
    }

    public WebElement PostalCode(WebDriver driver){
        By IDelement=By.id("BillingNewAddress_ZipPostalCode");
        WebElement p= driver.findElement(IDelement);
        return p;
    }

    public WebElement Phone(WebDriver driver){
        By IDelement=By.id("BillingNewAddress_PhoneNumber");
        WebElement p= driver.findElement(IDelement);
        return p;
    }

    public WebElement ContinueBtn1(WebDriver driver){
        By IDelement=By.cssSelector("button[name=\"save\"]");
        WebElement p= driver.findElement(IDelement);
        return p;
    }
    public WebElement ContinueBtn2(WebDriver driver){
        By IDelement=By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]");
        WebElement p= driver.findElement(IDelement);
        return p;
    }
    public WebElement ContinueBtn3(WebDriver driver){
        By IDelement=By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]");
        WebElement p= driver.findElement(IDelement);
        return p;
    }
    public WebElement ContinueBtn4(WebDriver driver){
        By IDelement=By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]");
        WebElement p= driver.findElement(IDelement);
        return p;
    }
    public WebElement ConfirmBtn(WebDriver driver){
        By IDelement=By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]");
        WebElement p= driver.findElement(IDelement);
        return p;
    }
    public WebElement ConfirMsg(WebDriver driver){
        By IDelement=By.cssSelector("//div[@class=\"section order-completed\"]//div[@class=\"title\"]");
        WebElement p= driver.findElement(IDelement);
        return p;
    }

    public WebElement Shippground(WebDriver driver){
        By IDelement=By.id("shippingoption_0");
        WebElement p= driver.findElement(IDelement);
        return p;
    }
    public WebElement Payement0(WebDriver driver){
        By IDelement=By.id("paymentmethod_0");
        WebElement p= driver.findElement(IDelement);
        return p;
    }


    //Cart PAge
    public WebElement Terms(WebDriver driver){
        By IDelement=By.id("termsofservice");
        WebElement t= driver.findElement(IDelement);
        return t;
    }
    public WebElement CheckoutBtn(WebDriver driver){
        By IDelement=By.id("checkout");
        WebElement p= driver.findElement(IDelement);
        return p;
    }

}
