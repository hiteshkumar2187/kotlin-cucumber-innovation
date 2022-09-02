package innovation.with.kotlin.cucumber

import innovation.with.kotlin.SpringKotlinInnovationApplicationTests
import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(features = ["src/test/resources"])
class CucumberIntegrationTest
