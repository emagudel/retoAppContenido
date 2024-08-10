package app.automation.utils;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.apache.commons.lang3.StringUtils;

import static app.automation.utils.Constantes.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class AppsUtils {
    private AppsUtils() {
    }

    public static AndroidDriver getMobileDriver() {
        return (AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public static Performable cambiarApp(String nombrePaquete) {
        return Task.where(actor -> getMobileDriver().activateApp(nombrePaquete));

    }

    public static Performable finalizarApp(String nombrePaquete) {
        return Task.where(actor -> getMobileDriver().terminateApp(nombrePaquete));
    }

    public static Performable installApp(String id) {
        return Task.where(actor -> {
            if (!StringUtils.isBlank(id)) {
                getMobileDriver().installApp(id);
            }
        });
    }

    public static boolean isAndroid() {
        return PLATFORM.equalsIgnoreCase(PLATFORM_ANDROID);
    }

    public static boolean isIOS() {
        return PLATFORM.equalsIgnoreCase(PLATFORM_IOS);
    }
}
