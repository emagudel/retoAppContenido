package app.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , glue = "app.deuna.stepsdefinitions"
        , plugin = {
        "pretty",
        "html:target/cucumberReports.html",
        "json:target/cucumber.json",
        "junit:target/cucumber-results.xml",
        "rerun:target/rerun/express.txt",
}
        , snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class E2ETest {
}
