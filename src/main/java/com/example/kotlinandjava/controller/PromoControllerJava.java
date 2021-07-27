package com.example.kotlinandjava.controller;

import com.example.kotlinandjava.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class PromoControllerJava {

    private final HelloService helloService;

    @GetMapping("/api/v1/hello-to-java-prop/{msg}")
    public Map<String, Object> hello(@PathVariable final String msg) {

        if ("java".equals(msg)) {
            Map<String, Object> returnedBody = new HashMap<>();
            returnedBody.put("JavaResultFromJavaProp", helloService.getHelloPropsJava());
            return returnedBody;
        } else {
            return new HashMap<>();
        }
    }

    @GetMapping("/api/v1/hello-to-kotlin-prop/{msg}")
    public Map<String, Object> hello2KotlinProp(@PathVariable final String msg) {

        if ("java".equals(msg)) {
            Map<String, Object> returnedBody = new HashMap<>();
            returnedBody.put("JavaResultFromKotlinProp", helloService.getHelloPropsKotlin());
            return returnedBody;
        } else {
            return new HashMap<>();
        }
    }
}
