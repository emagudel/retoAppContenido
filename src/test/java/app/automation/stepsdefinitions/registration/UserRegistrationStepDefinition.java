package app.automation.stepsdefinitions.registration;

import app.automation.tasks.registration.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static app.automation.ui.home.HomePage.LABEL_REGISTRATION_SUCCESSFUL;
import static app.automation.ui.home.HomePage.LABEL_WELCOME;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserRegistrationStepDefinition {

    @Given("the user registers with the following data {string} {string} {string}")
    public void loginWithUsernameEmailAndPasswordPassword(String username, String password, String email) {
        theActorInTheSpotlight().attemptsTo(Register.inApp(username,password,email));
    }

    @Then("the register is successful")
    public void theLoginIsSuccessful() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_WELCOME).isDisplayed());
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_REGISTRATION_SUCCESSFUL).isDisplayed());
    }

}