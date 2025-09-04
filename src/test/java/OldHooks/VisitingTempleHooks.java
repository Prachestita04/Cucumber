package OldHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class VisitingTempleHooks {
    @Before("@General")
    public void deposit() {
        System.out.println("Before enter into temple user should deposit his things in deposit counter");
    }

    @Before
    public void check() {
        System.out.println("User should be properly checked ");
    }

    @After("@Vip")
    public void donation() {
        System.out.println("After puja user will give some donation for temple");
    }

    @After
    public void take() {
        System.out.println("When user gets out from temple he will take his deposits from counter ");
    }
}
