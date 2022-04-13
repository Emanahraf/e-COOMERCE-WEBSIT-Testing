package Stepdefinitions;

import Pages.CheckOutPage;
import Pages.HomePage;
import Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class MakeorderStepdefinitions {
    HomePage h=new HomePage(driver);
    CheckOutPage C=new CheckOutPage();
    @And("User open his Cart")
    public void open() throws InterruptedException {
        h.CartIcon2.click();
        Thread.sleep(3000);
    }
    @And("user Accept Terms")
    public void Accept(){
        C.Terms(driver).click();
    }
    @And("user click check out")
    public void Check() throws InterruptedException {
        C.CheckoutBtn(driver).click();
        Thread.sleep(3000);
    }
    @And("User enter His Data")
    public void enter() throws InterruptedException {
        Select cur = new Select(C.Country(driver));
        cur.selectByVisibleText("Egypt");
        C.City(driver).sendKeys("demiatta");
        C.Add1(driver).sendKeys("RRRRR");
        C.PostalCode(driver).sendKeys("0107");
        C.Phone(driver).sendKeys("01100078843");
        C.ContinueBtn1(driver).click();
        //Thread.sleep(3000);
        BrowserUtils.WaitFor(3);
    }
    @And("user Choose payement method,Shipping and confirm order")
    public void Choose() throws InterruptedException {
        C.Shippground(driver).click();
        C.ContinueBtn2(driver).click();
        BrowserUtils.WaitFor(3);
        C.Payement0(driver).click();
        C.ContinueBtn3(driver).click();
        BrowserUtils.WaitFor(3);
        C.ContinueBtn4(driver).click();
        BrowserUtils.WaitFor(3);
        C.ConfirmBtn(driver).click();
        BrowserUtils.WaitFor(3);
    }
    @Then("order created succesufully")
    public void Create(){
        String f=  C.ConfirMsg(driver).getText();
        Assert.assertTrue(f.contains("Your order has been successfully processed!"));
    }


}
