package com.spring.bootcloud.config

import com.spring.bootcloud.condition.Condition1
import com.spring.bootcloud.condition.Condition2
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration

@Configuration
class ConditionConfig {


    // 加载时会执行conditional类的match方法
    // 如果比匹配则不会加载
    @Bean
    @Conditional(Condition1::class)
    fun getConfig1(): String{
        return "getConfig1"
    }

    @Bean
    fun getConfig2(): String {
        return "getConfig2"
    }

    @Bean
    @Conditional(Condition1::class, Condition2::class)
    fun getConfig3(): String {
        return "getConfig3"
    }
}
