package com.spring.bootcloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@SpringBootApplication
@RestController
class BootCloudApplication{

	@RequestMapping(path = ["/test"], method = [RequestMethod.GET], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
	fun test(): String{
		return "ok"
	}
}

fun main(args: Array<String>) {
	runApplication<BootCloudApplication>(*args)
}


