package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightBookStep {

    @Given("User wants to select {string} option from list")
    public void user_wants_to_select_option_from_list(String opt) {
        System.out.println("User wants to select " + opt + " option from list");
    }

    @When("User selects this and gives from as {string} to as {string}")
    public void user_selects_this_and_gives_from_as_to_as(String city1, String city2) {
        System.out.println("User selects this and gives from as " + city1 + " to as " + city2);
    }

    @When("User selects this and gives from as {string} to as {string} and add one more flight to destination as {string}")
    public void user_selects_this_and_gives_from_as_to_as_and_add_one_more_flight_to_destination_as(String city1, String city2, String city3) {
        System.out.println("User selects this and gives from as " + city1 + " to as " + city2 + " and add one more flight to destination as " + city3);
    }

    @Then("All the flights from this location will be shown")
    public void all_the_flights_from_this_location_will_be_shown() {
        System.out.println("All the flights from this location will be shown");
    }

    @Then("All the flights from these two locations will be shown")
    public void all_the_flights_from_these_two_locations_will_be_shown() {
        System.out.println("All the flights from these two locations will be shown");
    }

    @Then("User select one of them")
    public void user_select_one_of_them() {
        System.out.println("User select one of them");
    }

    @Then("User select one of them and connecting flight also")
    public void user_select_one_of_them_and_connecting_flight_also() {
        System.out.println("User select one of them and connecting flight also");
    }

    @Then("User have to pay Rs. {int}")
    public void user_have_to_pay_rs(Integer price) {
        System.out.println("User have to pay Rs. " + price);
    }


    @Then("User have to pay total amout of Rs. {int}")
    public void user_have_to_pay_total_amout_of_rs(Integer fare) {
        System.out.println("User have to pay total amout of Rs. " + fare);
    }


}
