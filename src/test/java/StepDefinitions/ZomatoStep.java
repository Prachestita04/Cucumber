package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZomatoStep {

    @Given("User must have registered one")
    public void user_must_have_registered_one() {
        System.out.println("Background 1:User must have registered one");
    }

    @Given("User in Zomato login page")
    public void user_in_zomato_login_page() {
        System.out.println("Background 2: User in Zomato login page");
    }

    @When("User enters username")
    public void user_enters_username() {
        System.out.println("User enters username");
    }

    @When("enters password")
    public void enters_password() {
        System.out.println("enters password");
    }

    @Then("User navigate to Zomato Home page")
    public void user_navigate_to_zomato_home_page() {
        System.out.println("User navigate to Zomato Home page");
    }

    @When("User select {string}")
    public void user_select(String foodType) {
        System.out.println("User select " + foodType);
    }

    @Then("User able to select this food from a {string} with quantity")
    public void user_able_to_select_this_food_from_a_with_quantity(String opt) {
        System.out.println("User able to select this food from a " + opt + " with quantity");
    }

    @When("User select food and do {string}")
    public void user_select_food_and_do(String tab) {
        System.out.println("User select food and do" + tab);
    }

    @Then("User able to see food in {string} option")
    public void user_able_to_see_food_in_option(String tab) {
        System.out.println("User able to see food in " + tab + " option");
    }

    @Then("order food")
    public void order_food() {
        System.out.println("order food");
    }

    @When("User goes to {string} page and click Cancel Order link")
    public void user_goes_to_page_and_click_cancel_order_link(String tab1) {
        System.out.println("User goes to " + tab1 + " page and click Cancel Order link");
    }

    @Then("Food order is cancelled")
    public void food_order_is_cancelled() {
        System.out.println("Food order is cancelled");
    }

    @Then("User fee will return within few hours")
    public void user_fee_will_return_within_few_hours() {
        System.out.println("User fee will return within few hours");
    }

}
