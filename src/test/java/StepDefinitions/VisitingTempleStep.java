package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisitingTempleStep {
    @Given("User must be in {string} religion")
    public void user_must_be_in_religion(String regType) {
        System.out.println("Step 1: User must be in "+regType+" religion");
    }
    @Given("User should have taken bath")
    public void user_should_have_taken_bath() {
        System.out.println("Step 2: User should have taken bath");
    }
    @When("User visits temple")
    public void user_visits_temple() {
        System.out.println("Step 3: User visits temple");
    }
    @Then("User performs puja in temple")
    public void user_performs_puja_in_temple() {
        System.out.println("Step 4 : User performs puja in temple");
    }

    @When("User visits temple and show his id")
    public void user_visits_temple_and_show_his_id() {
        System.out.println("Step 3: User visits temple and show his id");
    }
    @Then("User able to go in a VIP line and performs puja")
    public void user_able_to_go_in_a_vip_line_and_performs_puja() {
        System.out.println("Step 4: User able to go in a VIP line and performs puja");
    }

}
