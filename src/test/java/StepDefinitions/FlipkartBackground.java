package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartBackground {

    @Given("User is logged into Amazon")
    public void user_is_logged_into_amazon() {
        System.out.println("Background 1: User is logged into Amazon");
    }
    @When("User is in Orders tab")
    public void user_is_in_orders_tab() {
        System.out.println("Background 2: User is in Orders tab");
    }
    @When("user navigates to {string} order tab")
    public void user_navigates_to_cancelled_order_tab(String orderType) {
        System.out.println("user navigates to "+orderType+" tab");
    }
    @Then("{string} order tab should be opened")
    public void cancelled_order_tab_should_be_opened(String orderType) {
        System.out.println(orderType+" order tab should be opened");
    }

}
