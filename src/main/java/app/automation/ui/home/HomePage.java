package app.automation.ui.home;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

import static app.automation.utils.Constantes.*;
import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {

    public static final Target LABEL_WELCOME = the("Label Welcome")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='Welcome to ionix']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));

    public static final Target LABEL_REGISTRATION_SUCCESSFUL = the("Label Welcome")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='Your registration has been successful']"))
            .locatedForIOS(By.xpath(PENDIENTE_IOS))
            .waitingForNoMoreThan(Duration.ofSeconds(TIME_OUT_5));


}
