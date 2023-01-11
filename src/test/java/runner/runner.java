package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\VANDR\\eclipse-workspace\\TheFreeRangeTester\\features\\Google.feature",
		glue = { "steps" }, 
		monochrome = true, 
		plugin = { "pretty", "junit:target/JUnitReports/report.xml",
				"json:target/JSONReports/report.json", "html:target/HtmlReports" })
public class runner {
}
