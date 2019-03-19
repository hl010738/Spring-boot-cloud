package com.spring.bootcloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootCloudApplication

fun main(args: Array<String>) {
	runApplication<BootCloudApplication>(*args)
}
