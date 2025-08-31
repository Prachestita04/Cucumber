package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyFlatTagStep {

    @Given("User wants to choose {string} flat in {string} apartment")
    public void user_wants_to_choose_flat_in_apartment(String flatType, String apprtName) {
        System.out.println("User wants to choose " + flatType + " flat in " + apprtName + " apartment");
    }

    @When("User select from one of them")
    public void user_select_from_one_of_them() {
        System.out.println("User select from one of them");
    }

    @Then("User pays amount of Rs. {int}")
    public void user_pays_amount_of_rs(Integer amount) {
        System.out.println("User pays amount of Rs. " + amount);
    }
}
