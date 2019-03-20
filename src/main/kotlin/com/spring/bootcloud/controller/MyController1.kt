package com.spring.bootcloud.controller

import com.spring.bootcloud.config.MyConfig
import com.spring.bootcloud.config.MyConfigBean
import com.spring.bootcloud.entity.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MyController1{

    @Value("\${myConfig.demo1.name}")
    lateinit var name: String

    @Value("\${myConfig.demo1.age}")
    var age: Int = 0

    @Autowired
    lateinit var myConfig: MyConfig

    @GetMapping(path = ["/getPerson"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun getPerson(): Person{
        var person = Person()
        //person.name = name
        //person.age = age

        person.name = myConfig.myConfigBean().name
        person.age = myConfig.myConfigBean().age
        return person
    }
}