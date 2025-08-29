package StepDefinitions;

import Implementation.Product;
import Implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchStep {
    Product product;
    Search search;

    @Given("I have a search field on the Amazon")
    public void i_have_a_search_field_on_the_amazon() {
        System.out.println("Step 1: Given search field is present");
    }

    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        System.out.println("Step 2: I search for product " +
                "with name as " + productName + "and price as " + price);
        product = new Product(productName, price);
        product.getProductList();
    }

    @Then("Product having name {string} should be displayed")
    public void product_having_name_should_be_displayed(String productName) {
        System.out.println("Step 3: Product having "
                + productName + "name should be displayed");
        search = new Search();
        String name = search.displayProduct(product);

        Assert.assertEquals(product.getProductName(), name);
    }
}
