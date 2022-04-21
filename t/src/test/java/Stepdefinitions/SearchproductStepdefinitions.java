package Stepdefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class SearchproductStepdefinitions {
    LoginPage login1=new LoginPage();
    HomePage h=new HomePage(driver);
    @And("user login to his account")
    public void login() throws InterruptedException {
        login1.LoginUser(driver,"emy12345@gmail.com","123456");
        login1.LoginBtnElement(driver).click();
        Thread.sleep(3000);

    }

    @When("user enter search key")
    public void search() throws InterruptedException {
        h.Search.sendKeys("HTC One");
        Thread.sleep(3000);
    }
    @Then("user Get success search Result")
    public void searchresult(){
        String Result=h.searchItem.getText();

        System.out.println(Result);
        Assert.assertTrue(Result.contains("HTC One"));
    }
}
