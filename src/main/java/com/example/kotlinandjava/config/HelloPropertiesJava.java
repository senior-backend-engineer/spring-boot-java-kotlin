package com.example.kotlinandjava.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "hello-conf-java")
@Data
public class HelloPropertiesJava {

    private String title;
    private List<KeyValuePair> sampleList;

    @Data
    public static class KeyValuePair {

        private String key;
        private String value;
    }

}
