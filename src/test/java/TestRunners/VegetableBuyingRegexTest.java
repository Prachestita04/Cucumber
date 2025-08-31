package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\user\\IdeaProjects\\Cucumber\\src\\test\\resources\\Appfeatures\\vegetable_buying_regex.feature",
        glue = "StepDefinitions",
        plugin = {"pretty"}
)

public class VegetableBuyingRegexTest {
}
