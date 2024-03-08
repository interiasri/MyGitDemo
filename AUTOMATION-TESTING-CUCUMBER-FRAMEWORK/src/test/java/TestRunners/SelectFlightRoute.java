package TestRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features="Features/FlightRoute.feature", glue="steps", dryRun = false,
plugin = {"pretty", "html:testreports/SelectFlightRouteTest.html"})
public class SelectFlightRoute extends AbstractTestNGCucumberTests {

}
