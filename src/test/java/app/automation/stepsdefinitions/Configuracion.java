package app.automation.stepsdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Configuracion {

    public void actor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Cliente");
    }

    public void curtain() {
        OnStage.drawTheCurtain();
    }

    @Before("not @bypass")
    public void init() {
        actor();
    }

}
