package app.automation.ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {
    public static final Target TXT_USER = the("Input Username")
            .locatedForAndroid(By.xpath("//android.widget.EditText[1]"))
            .locatedForIOS(By.xpath("name == 'test-Username'"));

    public static final Target TXT_PASSWORD = the("Input Password")
            .locatedForAndroid(By.xpath("//android.widget.EditText[2]"))
            .locatedForIOS(By.xpath("**/XCUIElementTypeSecureTextField[`name == 'test-Password'`]"));

    public static final Target BTN_LOGIN = the("Button Login")
            .locatedForAndroid(By.xpath("//android.widget.Button[@content-desc=\"Log In\"]"))
            .locatedForIOS(By.xpath("test-LOGIN"));

    public static final Target LABEL_SKIP = the("Label skip")
            .locatedForAndroid(By.xpath("//android.widget.Button[@content-desc=\"Skip\"]"))
            .locatedForIOS(By.id("Ios"));

}
