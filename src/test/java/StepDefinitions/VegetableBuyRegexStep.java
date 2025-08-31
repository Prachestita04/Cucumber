package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VegetableBuyRegexStep {

    @Given("^User wants to select \"([^\"]+)\" and \"([^\"]+)\" to buy$")
    public void user_wants_to_select_and_to_buy(String veg1, String veg2) {
        System.out.println("Step 1: User wants to select "+veg1+ " and "+veg2+" to buy");
    }
    @When("^User select \"([^\"]+)\" and \"([^\"]+)\" from that app$")
    public void user_select_and_from_that_app(String veg1, String veg2) {
        System.out.println("Step 2: User select"+veg1+" and "+veg2+" from that app");
    }
    @When("select quantity of these vegatbles and click next option")
    public void select_quantity_of_these_vegatbles_and_click_next_option() {
        System.out.println("Step 3: Select quantity and press next");
    }
    @Then("^User ables to pay Rs. (\\d+)$")
    public void user_ables_to_pay_rs(Integer price) {
        System.out.println("User do payment as Rs. "+price);
    }

}
