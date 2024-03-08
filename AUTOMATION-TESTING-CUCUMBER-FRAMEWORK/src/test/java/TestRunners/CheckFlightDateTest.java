package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/FlightReserveDate.feature", glue = "steps", dryRun = false,
plugin = {"pretty", "html:testreports/flightreserve.html"})
public class CheckFlightDateTest extends AbstractTestNGCucumberTests {

}
