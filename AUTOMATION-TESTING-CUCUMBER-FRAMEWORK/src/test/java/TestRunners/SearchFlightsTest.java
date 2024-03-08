package TestRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/searchflights.feature", glue = "steps", dryRun = false,
plugin = {"pretty", "html:testreports/searchflights.html"})
public class SearchFlightsTest extends AbstractTestNGCucumberTests {

}
