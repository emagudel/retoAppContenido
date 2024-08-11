package app.automation.questions;

import app.automation.models.DataManager;

import java.math.BigDecimal;

import static app.automation.utils.Constantes.VALOR_INICIAL;


public class Verificar {

    private Verificar() {
    }

    public static BigDecimal pago() {
        return new BigDecimal(DataManager.getInstance().getDatosPrueba().get(VALOR_INICIAL)).subtract(new BigDecimal(DataManager.getInstance().getDatosPrueba().get("valor")));
    }

    public static BigDecimal recarga() {
        return  new BigDecimal(DataManager.getInstance().getDatosPrueba().get(VALOR_INICIAL)).add(new BigDecimal(DataManager.getInstance().getDatosPrueba().get("valor")));
    }
}
