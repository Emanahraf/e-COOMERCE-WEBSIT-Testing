package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.TestNG;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="D:\\testing\\t\\src\\main\\resources\\Feature",
        glue = "Stepdefinitions",
        plugin =  {"pretty",
                "html:target/cucumber-reports/Cucumber.html",
                "json:target/cucumber-reports/Cucumber.json",
               "junit:target/cucumber-reports/Cucumber.xml",
        },
        monochrome = true
)
public class TestRunner  {

}
