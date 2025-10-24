package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Appfeatures/billing_outline.feature",
        glue = "StepDefinitions",
        plugin = {"pretty"}
)
public class BillingTest {
}
