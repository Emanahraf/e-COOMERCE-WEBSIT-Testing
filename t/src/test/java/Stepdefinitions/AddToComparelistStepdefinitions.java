package Stepdefinitions;

import Pages.HomePage;
import io.cucumber.java.en.When;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class AddToComparelistStepdefinitions {
    HomePage h=new HomePage(driver);
    @When("user click on Add to Comparelist Button")
    public void userclickonAddtoCart() throws InterruptedException {
        h.AddToCompare3.click();
        Thread.sleep(3000);
    }
}
