package innovation.with.kotlin.cucumber.scenerios

import innovation.with.kotlin.config.TestFeignClient
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.spring.CucumberContextConfiguration
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

@CucumberContextConfiguration
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class StepsDefIntegrationTest {
    var latestResponse: ResponseEntity<String>? = null

    @Autowired
    lateinit var feignClient: TestFeignClient

    @Given("^the client calls /hello$")
    fun givenClientCallsHelloApi() {
       latestResponse = feignClient.callHelloApi()
    }

    @Then("^the client receives status of (\\d+)\$")
    fun thenResponseCodeMust200(statusCode: Int) {
        val currentStatusCode: HttpStatus = latestResponse!!.statusCode
        assertThat(
            "status code is incorrect : " + latestResponse!!.body,
            currentStatusCode.value(),
            `is`(statusCode)
        )
    }

    @And("^the client receives response of (.+)$")
    @Throws(Throwable::class)
    fun the_client_receives_server_version_body(body: String?) {
        assertThat(latestResponse!!.body, `is`(body))
    }

}