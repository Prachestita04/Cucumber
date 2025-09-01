package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BottleFillStep {

    @Given("User must have a {string} to fill water")
    public void user_must_have_a_to_fill_water(String container) {
        System.out.println("User must have a "+container+" to fill water");
    }
    @When("User press bottle filling option")
    public void user_press_bottle_filling_option() {
        System.out.println("User press bottle filling option");
    }
    @Then("{string} process should be started")
    public void process_should_be_started(String processType) {
        System.out.println(processType+" process should be started");
    }

    @When("After filling when user press {string} option")
    public void after_filling_when_user_press_option(String optionType) {
        System.out.println("After filling when user press "+optionType+" option");
    }
    @Then("water flow should be stopped")
    public void water_flow_should_be_stopped() {
        System.out.println("water flow should be stopped");
    }

}
