package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber; // this was added manually

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Sharif's PC\\eclipse-workspace\\TelaDoc_Health\\src\\main\\java\\feature\\teladoc.feature"
		,glue={"stepDefinition"}
		)


public class Test_Runner {

}
