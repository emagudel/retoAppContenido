package app.automation.interactions;

import app.automation.utils.AppsUtils;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Teclado {
    private static final String XPATH_NUMERICO_V_1 = "//android.widget.TextView[@text='%s']";
    private static final String XPATH_NUMERICO_IOS = "//XCUIElementTypeKey[@name='%s']";

    private Teclado() {
    }


    public static Performable numerico(String numero) {
        return Task.where(actor -> {
            char[] caracteres = numero.toCharArray();
            for (char c : caracteres) {
                if (AppsUtils.isAndroid())
                    AppsUtils.getMobileDriver().pressKey(new KeyEvent(AndroidKey.valueOf(String.format("DIGIT_%s", c))));
                if (AppsUtils.isIOS())
                    actor.attemptsTo(Click.on(String.format(XPATH_NUMERICO_IOS, c)));
            }
        });
    }

    public static Performable numericoV1(String numero) {
        return Task.where(actor -> {
            char[] caracteres = numero.toCharArray();
            for (char c : caracteres) {
                actor.attemptsTo(Click.on(String.format(XPATH_NUMERICO_V_1, c)));
            }
        });
    }

}
