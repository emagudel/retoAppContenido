package app.automation.stepsdefinitions.login;

import app.automation.tasks.login.LoginApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static app.automation.utils.AppsUtils.cambiarApp;
import static app.automation.utils.AppsUtils.installApp;
import static app.automation.utils.Constantes.APP_ROUTE;
import static app.automation.utils.Constantes.PAQUETE_APPQA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Given("Open the application login")
    public void Open_the_application() {
        theActorInTheSpotlight().attemptsTo(installApp(APP_ROUTE));
        theActorInTheSpotlight().attemptsTo(cambiarApp(PAQUETE_APPQA));
    }

    @When("Login with username {string} and password {string}")
    public void loginWithUsernameEmailAndPasswordPassword(String username, String password) {
        theActorInTheSpotlight().attemptsTo(LoginApp.inApp(username,password));
    }

}