package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features={"classpath:features"},
		glue="steps", 
		//tags="@Scenario2",
		monochrome= true, 
		dryRun = false, 
		
		plugin = {
				"pretty",
				"html:target/cucumber", //you save in target folder as html report in cucumber file
				"json:target/cucumber.json", //you save in report in json formate under target folder
		}
		
		
		)

public class LoginRunner {
	
	

}