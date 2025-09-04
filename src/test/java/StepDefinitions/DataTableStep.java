package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableStep {

    @Given("User has a valid login credentials of Jiomart")
    public void user_has_a_valid_login_credentials_of_jiomart() {
        System.out.println("User has a valid login credentials of Jiomart");
    }
    @Given("User has an active jio number")
    public void user_has_an_active_jio_number() {
        System.out.println("User has an active jio number");
    }
    @When("User adds fruits to the cart")
    public void user_adds_fruits_to_the_cart(DataTable dataTable) {
        List<List<String>> fruitList = dataTable.asLists(String.class);
//        int i =1;
        for(List<String> eachfruit: fruitList){
            System.out.println("fruit Names: "+" "+eachfruit.get(0));
//            System.out.println("Fruit Number: "+i+" "+eachfruit);
//            i++;
//            System.out.println(eachfruit);
        }
    }
    @When("User provides the quantity of each item")
    public void user_provides_the_quantity_of_each_item() {
        System.out.println("User provides the quantity of each item");
    }
    @Then("User is redirected to payment page")
    public void user_is_redirected_to_payment_page() {
        System.out.println("User is redirected to payment page");
    }

    @When("User adds milks and bakery products to the cart")
    public void userAddsMilksAndBakeryProductsToTheCart(DataTable dataTable) {
        List<List<String>> milkList = dataTable.asLists(String.class);
//        int i =1;
        for(List<String> eachmilkProduct: milkList){
            System.out.println("Names: "+" "+milkList.get(0));
//            System.out.println("Milk product Number: "+i+" "+eachmilkProduct);
//            i++;
//            System.out.println(eachmilkProduct);
        }

    }

    @When("User adds electronics products to the cart")
    public void userAddsElectronicsProductsToTheCart(DataTable dataTable) {
        List<List<String>> elctronicsList = dataTable.asLists(String.class);
//        int i =1;
        for(List<String> eachelectronic: elctronicsList){
            System.out.println("Electronic Names: "+" "+elctronicsList.get(0));
//            System.out.println("Electronic Number: "+i+" "+eachelectronic);
//            i++;
//            System.out.println(eachelectronic);
        }
    }
}
