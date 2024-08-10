package app.automation.ui.register;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

import static app.automation.utils.Constantes.PENDIENTE_IOS;
import static app.automation.utils.Constantes.TIME_OUT_5;
import static net.serenitybdd.screenplay.targets.Target.the;

public class RegisterPage {
    public static final Target TXT_USERNAME = the("Input Username")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@text='Username']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));
    public static final Target TXT_PASSWORD = the("Input Password")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@text='Password']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));
    public static final Target TXT_REPEAT_PASSWORD = the("Input Repeat Password")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@text='Repeat password']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));
    public static final Target TXT_EMAIL = the("Input Email")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@text='Email (Optional)']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));
    public static final Target BTN_SUBMIT = the("Button Submit")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='SUBMIT']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));
    public static final Target POPUP_EMAIL = the("Popup Email")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='Your email is empty, we recommended since is needed for account recovery, do you want continue?']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));
    public static final Target BTN_CONFIRM = the("Button Confirm")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='Confirm']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));

}
