import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class TestCases {
    WebDriver driver=null;
    RegistrationPage reg=new RegistrationPage();
    LoginPage login=new LoginPage();

    @BeforeTest
    public void Open() throws InterruptedException {
        String FilePath=System.getProperty("user.dir")+"\\b\\chromedriver.exe";
        System.out.println(FilePath);

        System.setProperty("webdriver.chrome.driver",FilePath);
        //2-
        driver=new ChromeDriver();
        //3-
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();

        //sleep
        Thread.sleep(3000);
    }

    @Test
    public void ValidDataRegister() throws InterruptedException {
        reg.RegBtn(driver).click();
        Thread.sleep(3000);
        reg.FirstName(driver).sendKeys("emanashraf");
        reg.LastName(driver).sendKeys("awad");
        reg.Regemail(driver).sendKeys(reg.validemail);

        reg.Regpass(driver).sendKeys(reg.validpass);
       reg.RegpassConfirm(driver).sendKeys(reg.validpass);
        reg.RegConfirmBtn(driver).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
       String res= reg.RegConMsg(driver).getText();
        System.out.println(res);

        Assert.assertTrue(res.contains("Your registration completed"));
        //press continue
        reg.Cofirm(driver).click();
        //logout

    }
    @Test
    public void ValidDataLogin() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        login.LoginUser(driver,reg.validemail, reg.validpass);

        Thread.sleep(3000);
        String url= driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(url.equals("https://demo.nopcommerce.com/"));
    }
@Test
public void ForgetPassword(){
    driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    login.ForgetPasswordBtn(driver).click();
// send vaild email
    login.ForgetPasswordemail(driver).sendKeys(reg.validemail);
    //static mesg to be added
    login.ForgetPasswordSubmit(driver).click();
    String msg=login.ForgetPassworMsg(driver).getText();
    Assert.assertTrue(msg.contains("Email with instructions has been sent to you"));
}
@Test
public void SearchProduct() throws InterruptedException {
    // login
    //login.LoginUser(driver,reg.validemail, reg.validpass);
   // Thread.sleep(3000);
    HomePage h=new HomePage(driver);
    h.Search.sendKeys("HTC One");
   // h.SearchBtn.click();
    Thread.sleep(3000);

    String Result=h.searchItem.getText();
    // scroll page

    System.out.println(Result);
    Assert.assertTrue(Result.contains("HTC One"));
}
@Test
public void ChangeCurrency(){
        //login
   // login.LoginUser(driver,reg.validemail, reg.validpass);
   HomePage h=new HomePage(driver);

  int index=0;
    h.currentCurrency.click();
    Select cur=new Select(h.currentCurrency);
    //get current currency
    String option1 = cur.getFirstSelectedOption().getText();
    System.out.println(option1);
    //if we choose op1 Change To op2
    if(option1.equals("US Dollar")){
        index++;

    }
  //  Select op2

   cur.selectByIndex(index);
    String option2= cur.getFirstSelectedOption().getText();


    Assert.assertFalse(option1.contains(option2));
}
@Test
public void SelectCategory(){
//login

    HomePage h=new HomePage(driver);
    //create object of soft

    Assertion softAssert = new SoftAssert();
    h.cat1.click();
    String url= driver.getCurrentUrl();
    //soft assert
    softAssert.assertTrue(url.equals("https://demo.nopcommerce.com/computers"));
     //select catory 2
    h.cat2.click();
    softAssert.assertTrue(url.equals("https://demo.nopcommerce.com/electronics"));
    //pass assertion
    h.cat3.click();
    softAssert.assertTrue(url.equals("https://demo.nopcommerce.com/apparel"));
}
@Test
public void FilterWithColor() throws InterruptedException {
        //login
    HomePage h=new HomePage(driver);
    h.cat3.click();
    Select cur=new Select(h.cat3);
   cur.selectByIndex(1);
    Thread.sleep(3000);
    h.graycolor.click();
    //url must change
    String url=driver.getCurrentUrl();
Assert.assertFalse(url.equals("https://demo.nopcommerce.com/shoes"));
}
    @Test
    public void SelectTags() throws InterruptedException {
     

        HomePage h=new HomePage(driver);
        h.cat1.click();
        h.Tag4.click();
        String tag="'"+h.Tag4.getText()+"'";
        System.out.println(tag);
        Thread.sleep(3000);
        String H=h.Header.getText();
        System.out.println(H);
        Assert.assertTrue(H.contains(tag));
    }
    @Test
    public void AddToCart() throws InterruptedException {
     //   driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

       // login.LoginUser(driver,reg.validemail, reg.validpass);

        //login
        HomePage h=new HomePage(driver);
//click add to cart of
        //login
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        h.AddToCart1.click();
        Thread.sleep(3000);

        String msg1=h.addTocartmsg.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(msg1.contains("The product has been added to your "));
        h.AddToCart2.click();
        Thread.sleep(3000);

        String msg2=h.addTocartmsg.getText();
        softAssert.assertTrue(msg2.contains("The product has been added to your "));
        h.AddToCart3.click();
        String msg3=h.addTocartmsg.getText();
        Thread.sleep(3000);
        softAssert.assertTrue(msg2.contains("The product has been added to your "));
        softAssert.assertAll();
    }
    @Test
    public void AddToWishList() throws InterruptedException {
       // driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //login.LoginUser(driver,reg.validemail, reg.validpass);

        HomePage h=new HomePage(driver);
//click add to cart of
        //login
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        h.AddToWish1.click();
        Thread.sleep(3000);

        String msg1=h.addTocartmsg.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(msg1.contains("The product has been added to your "));
        h.AddToWish2.click();
        Thread.sleep(3000);

        String msg2=h.addToWishmsg.getText();
        softAssert.assertTrue(msg2.contains("The product has been added to your "));
        h.AddToWish3.click();
        String msg3=h.addToWishmsg.getText();
        Thread.sleep(3000);
        softAssert.assertTrue(msg2.contains("The product has been added to your "));
        softAssert.assertAll();
    }
    @Test
    public void AddToCopmareList() throws InterruptedException {
        //driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //login.LoginUser(driver,reg.validemail, reg.validpass);

        HomePage h=new HomePage(driver);
//click add to cart of
        //login
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        h.AddToCompare1.click();
        Thread.sleep(3000);

        String msg1=h.addToComparemsg.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(msg1.contains("The product has been added to your "));
        h.AddToCompare2.click();
        Thread.sleep(3000);

        String msg2=h.addToComparemsg.getText();
        softAssert.assertTrue(msg2.contains("The product has been added to your "));
        h.AddToCompare3.click();
        String msg3=h.addToComparemsg.getText();
        Thread.sleep(3000);
        softAssert.assertTrue(msg2.contains("The product has been added to your "));
        softAssert.assertAll();
    }
    @Test
    public void MakeOrder() throws InterruptedException {
        //login
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        login.LoginUser(driver,"eman@gmail.com", "123456");

        //obj of check
        HomePage h=new HomePage(driver);
        CheckOutPage C=new CheckOutPage();
        //Add to cart  3
        h.AddToCart3.click();
        Thread.sleep(3000);
        // go to cart
        h.CartIcon2.click();
        Thread.sleep(3000);
        //click check out
        C.Terms(driver).click();
        C.CheckoutBtn(driver).click();
        //enter data
        Thread.sleep(3000);
//select c
        Select cur = new Select(C.Country(driver));
        cur.selectByVisibleText("Egypt");
        C.City(driver).sendKeys("demiatta");
        C.Add1(driver).sendKeys("RRRRR");
        C.PostalCode(driver).sendKeys("0107");
        C.Phone(driver).sendKeys("01100078843");
        C.ContinueBtn1(driver).click();
        Thread.sleep(3000);
        C.Shippground(driver).click();
        C.ContinueBtn2(driver).click();
        Thread.sleep(3000);
        C.Payement0(driver).click();
        C.ContinueBtn3(driver).click();
        Thread.sleep(3000);
        C.ContinueBtn4(driver).click();
        Thread.sleep(3000);
        C.ConfirmBtn(driver).click();
        Thread.sleep(3000);
        String m=  C.ConfirMsg(driver).getText();
        Assert.assertTrue(m.contains("Your order has been successfully processed!"));
    }

    @AfterTest
    public void Closebrowser() throws InterruptedException {
        Thread.sleep(3000);
        //
        driver.quit();
    }


}
