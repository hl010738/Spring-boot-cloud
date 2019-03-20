package com.spring.bootcloud.config

import org.springframework.beans.factory.annotation.Value

class MyConfigBean{

    @Value("\${myConfig.demo1.name}")
    lateinit var name: String

    @Value("\${myConfig.demo1.age}")
    var age = 0
}