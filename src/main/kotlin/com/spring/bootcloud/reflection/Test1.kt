package com.spring.bootcloud.reflection

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredFunctions

/*
    模拟spring boot启动过程
    反射调用test方法
 */
class Test1{
    fun test(){
        println("123")
    }
}

fun main(){
    var clazz: KClass<Test1> = Test1::class
    var functions = clazz.declaredFunctions
    functions.forEach { println(it.name) }

    var test = Test1::test
    test.invoke(Test1())
}