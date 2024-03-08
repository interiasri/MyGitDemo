package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/FlightReserveDate.feature", glue = "steps", dryRun = false,
plugin = {"pretty", "html:testreports/flightreserve.html"})
public class CheckFlightDateTest {

}
