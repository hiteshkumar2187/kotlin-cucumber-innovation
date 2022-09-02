package innovation.with.kotlin.config

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name="testclient", url="http://localhost:8080")
interface TestFeignClient {

    @RequestMapping(method= [RequestMethod.GET], value= ["/testing"])
    fun callTestApi(): ResponseEntity<String>

    @RequestMapping(method= [RequestMethod.GET], value= ["/hello"])
    fun callHelloApi(): ResponseEntity<String>
}