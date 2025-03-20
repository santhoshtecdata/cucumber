package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/verifyThePolicyflow.feature",
		glue="stepDifinitions"
	//	,dryRun= true
		
		
		)


public class runner {
	
	

}
