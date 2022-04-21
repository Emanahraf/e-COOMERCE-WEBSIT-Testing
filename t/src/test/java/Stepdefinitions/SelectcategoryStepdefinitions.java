package Stepdefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class SelectcategoryStepdefinitions {
    HomePage h=new HomePage(driver);
    @When("user Hover in Category")
    public void userClickinCategory() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(h.cat1).perform();

    }
    @And("user choose subCategroy")
    public void  userchoosesubCategroy(){
      h.subcat1.click();
    }
    @Then("user go succesufully to subCategroy page")
    public void Success(){
        String url= driver.getCurrentUrl();
        Assert.assertTrue(url.equals("https://demo.nopcommerce.com/desktops"));
    }
}
