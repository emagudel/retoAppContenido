package app.automation.models;

import com.amazonaws.util.StringUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class DatosPrueba implements Task {

    private final Map<String, String> datoPrueba;

    public DatosPrueba(Map<String, String> datoPrueba) {
        this.datoPrueba = datoPrueba;
    }

    public static Performable guardar(Map<String, String> datosPrueba) {
        return Tasks.instrumented(DatosPrueba.class, datosPrueba);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map.Entry<String, String> entrada : datoPrueba.entrySet()) {
            DataManager.getInstance().getDatosPrueba().put(StringUtils.trim(entrada.getKey()),
                    StringUtils.trim(entrada.getValue()));
        }
    }
}
