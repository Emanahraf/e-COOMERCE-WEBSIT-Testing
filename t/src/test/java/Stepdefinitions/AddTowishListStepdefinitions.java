package Stepdefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class AddTowishListStepdefinitions {
    HomePage h=new HomePage(driver);
    @When("user click on Add to Wishlist Button")
    public void userclickonAddtoWish() throws InterruptedException {
        h.AddToWish3.click();
        Thread.sleep(3000);
    }

}
