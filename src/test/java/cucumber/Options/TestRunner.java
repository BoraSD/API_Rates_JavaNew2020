package cucumber.Options;//package cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@test3",
        features = "src/test/java/FeatureFiles",
        glue = {"StepDefinitionFiles"},
        strict = true
)
public class TestRunner {


}
