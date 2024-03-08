package TestRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="Features/UserLogin.feature", glue = "steps", dryRun = false, 
plugin = {"pretty", "html:testreports/logintest.html"})
public class CheckLogin extends AbstractTestNGCucumberTests {

}
