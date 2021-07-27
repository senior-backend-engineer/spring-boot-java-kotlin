package com.example.kotlinandjava.service;


import com.example.kotlinandjava.config.HelloPropertiesJava;
import com.example.kotlinandjava.config.HelloPropertiesKotlin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService{

    private final HelloPropertiesJava helloPropertiesJava;

    private final HelloPropertiesKotlin helloPropertiesKotlin;

    public List<HelloPropertiesJava.KeyValuePair> getHelloPropsJava() {
        return helloPropertiesJava.getSampleList();
    }

    @Override
    public List<HelloPropertiesKotlin.KeyValuePair> getHelloPropsKotlin() {
        return helloPropertiesKotlin.getSampleList();
    }
}
