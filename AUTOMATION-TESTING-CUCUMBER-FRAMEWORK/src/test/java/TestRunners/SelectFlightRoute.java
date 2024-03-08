package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features/FlightRoute.feature", glue="steps", dryRun = false,
plugin = {"pretty", "html:testreports/SelectFlightRouteTest.html"})
public class SelectFlightRoute {

}
