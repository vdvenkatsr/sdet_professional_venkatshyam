package BBDTestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		///adfffdf
		features= "C:\\Users\\nayaka\\eclipse-workspace\\SeleniumAssignment\\src\\test\\java\\com\\qa\\Features\\OpenSource.feature",
		glue="com.qa.StepDefinition",
		dryRun = false,
		strict = true,
		monochrome = true,
		format = {"pretty" , "html:test-output"}
		)


public class OpenSource {
	

}
