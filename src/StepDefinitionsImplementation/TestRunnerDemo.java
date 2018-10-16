package StepDefinitionsImplementation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeaturefileDemo", monochrome = true, dryRun = false, plugin = { "pretty",
		"json:JSON/cucumber.json",
		"html:HTML/html_report.html" }, glue = { "HookDefinitions", "StepDefinitionsImplementation" })

public class TestRunnerDemo {

}
