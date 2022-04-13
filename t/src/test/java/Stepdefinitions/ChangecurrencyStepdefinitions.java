package Stepdefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static Stepdefinitions.LoginStepdefinitions.driver;

public class ChangecurrencyStepdefinitions {
    HomePage h = new HomePage(driver);
    String option1="";
    String option2="";

    @When("user Click in currency list")
    public void userClickincurrencylist(){
        h.currentCurrency.click();


    }
    @And("user choose from currency list")
    public void choosefromlist() throws InterruptedException {

        Select cur = new Select(h.currentCurrency);
        //get current currency
         option1 = cur.getFirstSelectedOption().getText();
        System.out.println(option1);
        int index = 0;


        if (option1.equals("US Dollar")) {
            index++;

        }
        //  Select op2

        cur.selectByIndex(index);
Thread.sleep(3000);
         option2= cur.getFirstSelectedOption().getText();
        System.out.println(option2);
    }
    @Then("currency change succesufully")
    public void currencychangesuccesufully(){

        Assert.assertFalse(option1.equals(option2));
    }

}
