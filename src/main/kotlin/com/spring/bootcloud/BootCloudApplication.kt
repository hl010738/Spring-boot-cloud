package com.spring.bootcloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.Mapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class BootCloudApplication{
	@PostMapping(path = ["/test"])
	fun test(): String{
		return "ok"
	}
}

fun main(args: Array<String>) {
	runApplication<BootCloudApplication>(*args)
}


