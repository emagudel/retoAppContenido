package app.automation.runners.registration;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/register/user_registration.feature",
        glue = "app.automation.stepsdefinitions",
        plugin = {
                "pretty",
                "html:target/cucumberReports.html",
                "json:target/cucumber.json",
                "junit:target/cucumber-results.xml",
                "rerun:target/rerun/express.txt",
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
        ,tags = "@user_registration"
)
public class UserRegistrationTest {
}