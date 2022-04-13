package Stepdefinitions;

import Pages.LoginPage;
import Pages.RegistrationPage;
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

public class RegistrationStepdefinitions {

   RegistrationPage reg=new RegistrationPage();







   @Given("user Click register button")
   public void userClickregisterbutton(){
      reg.RegBtn1(LoginStepdefinitions.driver).click();
   }
   @When("user enter His Data: firstname-lastName-emailandpassword")
   public void userenterHisData(){
      reg.FirstName(LoginStepdefinitions.driver).sendKeys("emanashraf");
      reg.LastName(LoginStepdefinitions.driver).sendKeys("awad");
      reg.Regemail(LoginStepdefinitions.driver).sendKeys("emy12345@gmail.com");
      reg.Regpass(LoginStepdefinitions.driver).sendKeys("123456");
      reg.RegpassConfirm(LoginStepdefinitions.driver).sendKeys("123456");
   }
   @And("click on register button")
   public void clickonregisterbutton() throws InterruptedException {
      reg.RegConfirmBtn(LoginStepdefinitions.driver).sendKeys(Keys.ENTER);
      Thread.sleep(3000);
   }
   @Then("registration completed succesufully")
   public void registrationcompletedsuccesufully(){
      String res= reg.RegConMsg(LoginStepdefinitions.driver).getText();
    //  System.out.println(res);

      Assert.assertTrue(res.contains("Your registration completed"));

}


}
