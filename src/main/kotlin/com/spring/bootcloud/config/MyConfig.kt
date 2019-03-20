package com.spring.bootcloud.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MyConfig{
    @Bean
    fun myConfigBean(): MyConfigBean{
        return MyConfigBean()
    }
}