package com.spring.bootcloud

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import javax.annotation.PostConstruct

/*
	Kotlin代码
 */
@SpringBootApplication
@RestController
class BootCloudApplication{

	companion object{
		val logger: Logger = LoggerFactory.getLogger(BootCloudApplication::class.java)
	}

	@RequestMapping(path = ["/test"], method = [RequestMethod.GET], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
	fun test(): String{
		return "ok"
	}

	@PostConstruct
	fun log(){
		logger.trace("Trace message")
		logger.debug("Debug message")
		logger.info("Info message")
		logger.warn("Warn message")
		logger.error("Error message")
	}
}

fun main(args: Array<String>) {
	runApplication<BootCloudApplication>(*args)
}


