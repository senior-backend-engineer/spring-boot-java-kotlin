package com.example.kotlinandjava.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "hello-conf-kotlin")
class HelloPropertiesKotlin {
    var title: String? = null
    var sampleList: List<KeyValuePair>? = null

    class KeyValuePair {

        var key: String? = null
        var value: String? = null
    }
}
