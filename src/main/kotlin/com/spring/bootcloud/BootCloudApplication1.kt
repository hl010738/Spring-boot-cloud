package com.spring.bootcloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

/*
	Kotlin代码
 */
@SpringBootApplication
@RestController
class BootCloudApplication1{

	@RequestMapping(path = ["/test"], method = [RequestMethod.GET], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
	fun test(): String{
		return "ok"
	}
}

fun main(args: Array<String>) {
	runApplication<BootCloudApplication>(*args)
}


