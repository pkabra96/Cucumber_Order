package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "Feature", glue = { "stepDefinition" }, tags = { "@tag6,@data_driven" },
		plugin = {"pretty","html:target/cucmberreport.html"}
)
public class demorun {

}
