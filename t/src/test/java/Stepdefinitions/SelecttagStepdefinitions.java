package Stepdefinitions;

import Pages.CategoryPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class SelecttagStepdefinitions {
    HomePage h=new HomePage(driver);
    CategoryPage C=new CategoryPage(driver);
    @And("user choose Tag")
    public void userchooseTag() throws InterruptedException {
        C.Tag4.click();
        Thread.sleep(3000);
    }
    @Then("Operation done succesufully")
    public void Operationdonesuccesufully(){
        String tag=C.Tag4.getText();
        String H=h.Header.getText();
        System.out.println(H);
        Assert.assertTrue(H.contains(tag));
    }

}
