package app.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import java.util.concurrent.TimeUnit;

public class Esperar implements Performable {
    private final long segundos;

    public Esperar(long segundos) {
        this.segundos = segundos;
    }

    public static Esperar segundos(long segundos) {
        return Tasks.instrumented(Esperar.class, segundos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
