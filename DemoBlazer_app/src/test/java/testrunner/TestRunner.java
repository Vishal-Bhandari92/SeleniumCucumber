package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //specify where features are stored
        features= "src/test/resources/features",
        //specify where step definitions are kept       
        //this is the name of the package where the step definitions are held
        glue = {"StepDefinition"},
        tags = "@Login",
     //  plugin = {"pretty", "json:target/json-report/cucumber.json"},

        dryRun = false,
        //Console the output in readable way
        monochrome = true
) public class TestRunner {
}
