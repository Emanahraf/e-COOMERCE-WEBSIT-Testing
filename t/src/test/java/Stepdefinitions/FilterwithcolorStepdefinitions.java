package Stepdefinitions;

import Pages.CategoryPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class FilterwithcolorStepdefinitions {
    HomePage h=new HomePage(driver);
    CategoryPage C=new CategoryPage(driver);
    @When("user click on Categroy")
    public void userclickonCategroy(){
        h.cat3.click();

    }
    @And("user click on subCategroy")
    public void userclickonsubCategroy(){
        C.shoes.click();
    }
    @And("user choose Color")
    public void  userchooseColor(){
        C.garycolor.click();
    }
    @Then("Filter done succesufully")
    public void successfilter(){
        String url=driver.getCurrentUrl();
        Assert.assertFalse(url.equals("https://demo.nopcommerce.com/shoes"));
    }
}
