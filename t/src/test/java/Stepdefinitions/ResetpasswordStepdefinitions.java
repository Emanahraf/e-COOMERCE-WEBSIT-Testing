package Stepdefinitions;

import Pages.ResetpasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class ResetpasswordStepdefinitions {
    ResetpasswordPage reset=new ResetpasswordPage();

    @And("user click Reset password")
    public void userclickResetpassword(){
        reset.ForgetPasswordBtn(driver).click();
    }
    @When("user enter His email")
    public void userenterHisemail(){
        reset.ForgetPasswordemail(driver).sendKeys("emy12345@gmail.com");
    }

    @And("click on reset button")
    public void clickonresetbutton(){
        reset.ForgetPasswordSubmit(driver).click();
    }
    @Then("reset completed succesufully")
    public void resetcompletedsuccesufully(){
        String msg=reset.ForgetPassworMsg(driver).getText();
        Assert.assertTrue(msg.contains("Email with instructions has been sent to you"));

    }
}
