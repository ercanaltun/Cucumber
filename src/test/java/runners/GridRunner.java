package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/GridFeatures/grid_test_case.feature",
        glue = "stepDefinitions",
        tags = "@@grid_chrome",
        dryRun = false)


public class GridRunner {
}
