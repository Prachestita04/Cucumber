package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WatchMovieStep {

    @Given("User must be a registered one in Netflix app")
    public void user_must_be_a_registered_one_in_netflix_app() {
        System.out.println("Step 1: User must be a registered one in Netflix app");
    }
    @Given("User has a subscription")
    public void user_has_a_subscription() {
        System.out.println("Step 2: User has a subscription");
    }
    @When("User opens one movie and click watch option")
    public void user_opens_one_movie_and_click_watch_option() {
        System.out.println("Step 3: User opens one movie and click watch option");
    }
    @Then("User can see that movie")
    public void user_can_see_that_movie() {
        System.out.println("Step 4: User can see that movie");
    }
}
