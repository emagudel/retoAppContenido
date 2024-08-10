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

    @When("the user registers with the following data {string} {string} {string}")
    public void loginWithUsernameEmailAndPassword(String username, String password, String email) {
        theActorInTheSpotlight().attemptsTo(Register.inApp(username,password,email));
    }
    @When("the user registers with the following data empty")
    public void loginWithUsernameEmailAndPasswordEmpty() {
        theActorInTheSpotlight().attemptsTo(Register.inAppEmpty());
    }
    @When("the user registers with the following data without username but filling in the password {string}")
    public void loginWithUsernameEmailAndPasswordWithoutUsernameButFillingInThePassword(String password) {
        theActorInTheSpotlight().attemptsTo(Register.inAppNoUsername(password));
    }
    @Then("the register is successful")
    public void theLoginIsSuccessful() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_WELCOME).isDisplayed());
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_REGISTRATION_SUCCESSFUL).isDisplayed());
    }
    @Then("the register is is failed with data empty")
    public void theLoginIsFailedWithDataEmpty() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_WELCOME).isNotDisplayed());
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_REGISTRATION_SUCCESSFUL).isNotDisplayed());
    }
    @Then("the register is is failed with data No Username")
    public void theLoginIsFailedWithDataNoUsername() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_WELCOME).isNotDisplayed());
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_REGISTRATION_SUCCESSFUL).isNotDisplayed());
    }
}