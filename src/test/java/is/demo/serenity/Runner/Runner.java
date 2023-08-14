package is.demo.serenity.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (

        features = "src/test/resources/feature/NombreEmpleado.feature",
        glue = "is/demo/serenity/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {
}
