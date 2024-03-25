package StepDefinitions;

import io.cucumber.java.en.Given;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_login() {
        System.out.println("=== I am inside LoginDemoSteps_POM ====");
    }
}
