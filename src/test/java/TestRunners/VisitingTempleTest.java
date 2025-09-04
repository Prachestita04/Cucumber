package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\user\\IdeaProjects\\Cucumber\\src\\test\\resources\\Appfeatures\\visiting_temple.feature",
        glue = {"StepDefinitions", "OldHooks"},
        plugin = {"pretty"},
        tags = "@General"
)

public class VisitingTempleTest {
}
