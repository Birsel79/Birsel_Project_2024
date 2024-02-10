package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
    glue={ "stepDefinitions" },
    tags = "@milestone_1 and not @milestone_1_2")
public class CucumberTestRunnerTest extends AbstractTestNGCucumberTests {
}
