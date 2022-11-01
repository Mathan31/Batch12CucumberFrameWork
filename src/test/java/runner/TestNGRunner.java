package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/resources/features/",  
		glue = {"steps","hooks"},
		dryRun = false, 
		monochrome = true,
		tags = "@Smoke",
		plugin = {"pretty","json:target/Search.json","html:target/Search.html",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests{
	// To Run all the feature file in parrallel
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
