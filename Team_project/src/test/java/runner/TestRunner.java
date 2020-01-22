package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" }, 
				features = "classpath:features/PrimaryMenuFeatures" , 
				glue = { "stepDefenetion" },
				tags = {"@BIT_Contact"},
				dryRun = false)

public class TestRunner {

}

