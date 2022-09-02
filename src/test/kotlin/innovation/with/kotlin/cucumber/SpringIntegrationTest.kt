//package innovation.with.kotlin.cucumber
//
//import innovation.with.kotlin.config.TestFeignClient
//
//import io.cucumber.spring.CucumberContextConfiguration;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.http.ResponseEntity
//
//@CucumberContextConfiguration
//@SpringBootTest( webEnvironment = WebEnvironment.DEFINED_PORT)
//class SpringIntegrationTest {
//
//    var latestResponse: ResponseEntity<String>? = null
//
//    @Autowired
//    lateinit var feignClient: TestFeignClient
//
//    fun callHelloApi() : ResponseEntity<String>? {
//        latestResponse = feignClient.callHelloApi()
//        return latestResponse
//    }
//}