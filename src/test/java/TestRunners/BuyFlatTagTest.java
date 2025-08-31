package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\user\\IdeaProjects\\Cucumber\\src\\test\\resources\\Appfeatures\\buy_flat.feature",
        glue = "StepDefinitions",
        plugin = {"pretty"},
        tags = "@Smoke or not @Regression"
)

public class BuyFlatTagTest {
}
