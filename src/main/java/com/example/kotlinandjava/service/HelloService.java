package com.example.kotlinandjava.service;


import com.example.kotlinandjava.config.HelloPropertiesJava;
import com.example.kotlinandjava.config.HelloPropertiesKotlin;

import java.util.List;

public interface HelloService {

    default String sayHello() {
        return "hello";
    }

    List<HelloPropertiesJava.KeyValuePair> getHelloPropsJava();

    List<HelloPropertiesKotlin.KeyValuePair> getHelloPropsKotlin();
}
