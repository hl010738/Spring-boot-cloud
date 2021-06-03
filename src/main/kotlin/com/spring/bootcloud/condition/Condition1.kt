package com.spring.bootcloud.condition

import org.springframework.context.annotation.Condition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.type.AnnotatedTypeMetadata

// 自定义 condition 注解
class Condition1: Condition {

    override fun matches(context: ConditionContext, metadata: AnnotatedTypeMetadata): Boolean {

        var value = context.environment.getProperty("condition1.test.value")

        if ("shanghai".equals(value, true)){
            return true
        }

        return false
    }
}
