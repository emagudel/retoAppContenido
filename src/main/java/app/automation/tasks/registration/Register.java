package app.automation.tasks.registration;

import app.automation.interactions.Esperar;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static app.automation.ui.register.RegisterPage.*;

public class Register {

    private Register() {
    }

    public static Performable inApp(String username, String password, String email) {
        return Task.where(actor -> {
            actor.attemptsTo(Click.on(TXT_USERNAME).afterWaitingUntilPresent());
            actor.attemptsTo(Enter.theValue(username).into(TXT_USERNAME));
            actor.attemptsTo(Click.on(TXT_PASSWORD).afterWaitingUntilPresent());
            actor.attemptsTo(Enter.theValue(password).into(TXT_PASSWORD));
            actor.attemptsTo(Click.on(TXT_REPEAT_PASSWORD).afterWaitingUntilPresent());
            actor.attemptsTo(Enter.theValue(password).into(TXT_REPEAT_PASSWORD));
            if(email.isEmpty()){
                actor.attemptsTo(Click.on(BTN_SUBMIT));
                if(POPUP_EMAIL.resolveFor(actor).isVisible()){
                    actor.attemptsTo(Click.on(BTN_CONFIRM));
                    actor.attemptsTo(Esperar.segundos(2));
                }
            }else{
                actor.attemptsTo(Click.on(TXT_EMAIL).afterWaitingUntilPresent());
                actor.attemptsTo(Enter.theValue(email).into(TXT_EMAIL));
                actor.attemptsTo(Click.on(BTN_SUBMIT));
                actor.attemptsTo(Esperar.segundos(2));
            }
        });
    }

    public static Performable inAppEmpty() {
        return Task.where(actor -> {
            actor.attemptsTo(Click.on(BTN_SUBMIT));
        });
    }

    public static Performable inAppNoUsername(String password) {
        return Task.where(actor -> {
            actor.attemptsTo(Click.on(TXT_PASSWORD).afterWaitingUntilPresent());
            actor.attemptsTo(Enter.theValue(password).into(TXT_PASSWORD));
            actor.attemptsTo(Click.on(TXT_REPEAT_PASSWORD).afterWaitingUntilPresent());
            actor.attemptsTo(Enter.theValue(password).into(TXT_REPEAT_PASSWORD));
            actor.attemptsTo(Click.on(BTN_SUBMIT));
            if(POPUP_EMAIL.resolveFor(actor).isVisible()){
                actor.attemptsTo(Click.on(BTN_CONFIRM));
                actor.attemptsTo(Esperar.segundos(2));
            }
        });
    }

}
