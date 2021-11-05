package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                plugin = {"pretty", "json:cucumber/test-report/cucumber.json"},
                features = {"classpath:features"},
                monochrome = true,
                glue = {"steps"}
        )
public class CucumberRunner {

}
