package app.automation.interactions;

import app.automation.models.DatosPrueba;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.List;
import java.util.Map;

public class Cargar {
    private Cargar() {
    }

    public static Performable datosPrueba(List<Map<String, String>> listaDatosPrueba) {
        return Task.where(actor -> actor.attemptsTo(DatosPrueba.guardar(listaDatosPrueba.get(0))));
    }
}
