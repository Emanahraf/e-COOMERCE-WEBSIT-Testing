package Stepdefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class AddtocartStepdefinitions {
    HomePage h=new HomePage(driver);
    @When("user click on Add to Cart")
    public void userclickonAddtoCart() throws InterruptedException {
        h.AddToCart3.click();
        Thread.sleep(3000);
    }
    @Then("Adding Operation done succesufully")
    public void AddToCart() throws InterruptedException {
        String msg=h.addTocartmsg.getText();
        //Thread.sleep(3000);
        Assert.assertTrue(msg.contains("The product has been added to your "));
    }
}
