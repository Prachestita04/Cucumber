package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberStep {

    @Given("User wants to select a car of type {string}")
    public void user_wants_to_select_a_car_of_type(String carType) {
        System.out.println("Step 1: User wants to select a car of type " + carType);
    }

    @When("User selects car type as {string} and pick up point as {string} and drop point as {string}")
    public void user_selects_car_type_as_and_pick_up_point_as_and_drop_point_as(String carType, String pick, String drop) {
        System.out.println("Step 2: User selects a car type as " + carType + " " +
                "add pickup location as " + pick + " add drop location as " + drop);
    }

    @Then("Driver starts journey")
    public void driver_starts_journey() {
        System.out.println("Step 3: Driver starts journey");
    }

    @And("Driver ends journey")
    public void driver_ends_journey() {
        System.out.println("Step 4: Driver ends journey");
    }

    @Then("User pays Rs. {int}")
    public void user_pays_rs(Integer fare) {
        System.out.println("Step 5: User pays the amount of INR " + fare);
    }
}
