package OldHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class WatchMovieHook {
    @Before(order = 1)
    public void setupBrowser(){
        System.out.println("Set system properties for browser");
    }
    @Before(order = 2)
    public void setupUrl(){
        System.out.println("Go to Netflix url to watch movie");
    }
    @BeforeStep
    public void beforeStep(){
        System.out.println("This is executing before each step");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("This is executing after each step");
    }
    @After(order = 1)
    public void logout(){
        System.out.println("Logout from Netflix website after watching movie");
    }
    @After(order = 2)
    public void tearDown(){
        System.out.println("Quit the browser");
    }
}
