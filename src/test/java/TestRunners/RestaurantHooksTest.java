package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\user\\IdeaProjects\\Cucumber\\src\\test\\resources\\Appfeatures\\restarunat_table_book_hook.feature",
        glue = {"StepDefinitions", "OldHooks"},
        plugin = {"pretty"},
        publish = true
)

public class RestaurantHooksTest {
}
