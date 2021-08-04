package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"src/test/resources/featureFiles"},
				glue = {"stepDefinitions"},
				tags = "@Register",
				plugin = {"pretty", "html:target/Report.html"},
				//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
				monochrome = true
				)
public class Runner {
	
}
