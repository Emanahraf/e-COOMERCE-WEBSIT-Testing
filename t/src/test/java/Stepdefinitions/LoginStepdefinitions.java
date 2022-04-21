package Stepdefinitions;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginStepdefinitions {
   static WebDriver driver=null;
    LoginPage login=new LoginPage();

@Given("open browser and neivate to website")
public void openbrowser() throws InterruptedException {
    String FilePath = System.getProperty("user.dir") + "\\b\\chromedriver.exe";
    System.out.println(FilePath);

    System.setProperty("webdriver.chrome.driver", FilePath);
    //2-
    driver = new ChromeDriver();
    //3-
    driver.navigate().to("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();

    //sleep
    Thread.sleep(3000);

}





    @Given("user Click login button")
    public void userClickloginbutton(){
        login.LoginBtnElement1(driver).click();
    }
    @When("user enter His Data: email and password")
    public void EnterVaildLoginData(){
        login.LoginUser(driver,"emy12345@gmail.com","123456");

    }
    @And("click on Login button")
    public void ClickLoginButton() throws InterruptedException {

        login.LoginBtnElement(driver).click();
        Thread.sleep(3000);
    }
    @Then("Login completed succesufully")
    public void GoToHomePage() throws InterruptedException {

        String url= driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(url.equals("https://demo.nopcommerce.com/"));
    }
   @After
    public void closebroswer(){
        driver.quit();
    }
}
