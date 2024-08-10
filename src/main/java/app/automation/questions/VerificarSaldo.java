package app.automation.questions;

import app.automation.models.DataManager;

import java.math.BigDecimal;

import static app.automation.utils.Constantes.SALDO_INICIAL;


public class VerificarSaldo {

    private VerificarSaldo() {
    }

    public static BigDecimal pago() {
        return new BigDecimal(DataManager.getInstance().getDatosPrueba().get(SALDO_INICIAL)).subtract(new BigDecimal(DataManager.getInstance().getDatosPrueba().get("valor")));
    }

    public static BigDecimal recarga() {
        return  new BigDecimal(DataManager.getInstance().getDatosPrueba().get(SALDO_INICIAL)).add(new BigDecimal(DataManager.getInstance().getDatosPrueba().get("valor")));
    }
}
