package app.automation.tasks.login;

import app.automation.interactions.Esperar;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static app.automation.ui.login.LoginPage.*;

public class LoginApp {

    private LoginApp() {
    }

    public static Performable inApp(String username, String password) {
        return Task.where(actor -> {
            actor.attemptsTo(Click.on(TXT_USER).afterWaitingUntilPresent());
            actor.attemptsTo(Enter.theValue(username).into(TXT_USER));
            actor.attemptsTo(Click.on(TXT_PASSWORD).afterWaitingUntilPresent());
            actor.attemptsTo(Enter.theValue(password).into(TXT_PASSWORD));
            actor.attemptsTo(Click.on(BTN_LOGIN));
            actor.attemptsTo(Esperar.segundos(3));
            if(LABEL_SKIP.resolveFor(actor).isVisible()){
                actor.attemptsTo(Click.on(LABEL_SKIP));
            }
        });
    }

}
