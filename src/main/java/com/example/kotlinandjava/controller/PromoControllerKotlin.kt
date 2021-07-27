package com.example.kotlinandjava.controller

import com.example.kotlinandjava.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PromoControllerKotlin (private var helloService: HelloService) {

    @GetMapping("/api/v1/hello-kotlin/{msg}")
    fun sayHelloFromKotlin(@PathVariable msg: String) : Map<String, Any> {
        return if ("kotlin" == msg) {
            val returnedBody = HashMap<String, Any>()
            returnedBody["kotlinResult"] = helloService.helloPropsJava
            returnedBody
        } else {
            HashMap()
        }
    }
}
