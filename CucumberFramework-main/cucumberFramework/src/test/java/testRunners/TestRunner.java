package testRunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/raguldeep.ravindran/Documents/cucumberFramework/src/test/resources/features",
        glue = "stepDefinitions", dryRun = false, tags = "@login",
        plugin = {"pretty", "html:target/cucumber-html-Report"},
        monochrome = true)

public class TestRunner {
}



