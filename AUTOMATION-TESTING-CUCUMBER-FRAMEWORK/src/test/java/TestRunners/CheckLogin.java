package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/UserLogin.feature", glue = "steps", dryRun = false, 
plugin = {"pretty", "html:testreports/logintest.html"})
public class CheckLogin {

}
