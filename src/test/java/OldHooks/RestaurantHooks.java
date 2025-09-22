package OldHooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestaurantHooks {
    @Before(order = 1)
    public void setupBrowser() {
        System.out.println("Set system properties for browser");
    }

    @Before(order = 2)
    public void setupUrl(Scenario example) {
//        int i=0;
//        System.out.println(9/i);
//        System.out.println(example.getName());
        System.out.println("Login to restaurant booking website");
    }

    @After(order = 1)
    public void logout() {
        System.out.println("Logout of the restaurant booking website");
    }

    @After(order = 2)
    public void teatDown() {
        System.out.println("Quit the browser");
    }
}
