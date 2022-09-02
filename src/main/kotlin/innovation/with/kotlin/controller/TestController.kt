package innovation.with.kotlin.controller

import innovation.with.kotlin.config.TestFeignClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @Autowired
    lateinit var feignClient: TestFeignClient

    @GetMapping("/testing")
    open fun testing(): ResponseEntity<String?>? {
        return ResponseEntity("hello from kotlin", HttpStatus.OK)
    }

    @GetMapping("/hello")
    open fun test(): ResponseEntity<String?>? {
        var response: ResponseEntity<String> = feignClient.callTestApi()
        return ResponseEntity(response.body, HttpStatus.OK)
    }
}