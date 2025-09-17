package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingWithOutLineSteps {
    public Double billing;
    public Double tax;

    @Given("User is on billing page")
    public void user_is_on_billing_page() {
        System.out.println("Step 1 : User is on billing page");
    }

    @When("user enters billing amount {string}")
    public void user_enters_billing_amount(String billingAmount) {
        System.out.println("Step 2 : user enters billing amount");
        this.billing = Double.parseDouble(billingAmount);
    }

    @When("user enters tax amount {string}")
    public void user_enters_tax_amount(String taxAmount) {
        System.out.println("Step 3: user enters tax amount");
        this.tax = Double.parseDouble(taxAmount);
    }

    @When("user clicks on calculate button")
    public void userClicksOnCalculateButton() {
        System.out.println("Step4: User clicks on calculate button");
    }

    @Then("it gives final amount {string}")
    public void it_gives_final_amount(String finalAmount) {
        System.out.println("Step 5: It gives the final amount: ");
        if (Double.parseDouble(finalAmount) == this.billing + this.tax) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }


}
