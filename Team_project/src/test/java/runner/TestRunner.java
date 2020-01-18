package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" }, 
				features = "src/test/resources/PrimaryMenuFeatures/BIT_HomePage.feature", 
				glue = { "stepDefenetion" },
				tags = {"@BIT_HP"},
				dryRun = false)

public class TestRunner {

}

