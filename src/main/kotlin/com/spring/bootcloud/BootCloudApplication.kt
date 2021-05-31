package com.spring.bootcloud

import com.spring.bootcloud.websocket.DefaultWebSocketService
import com.spring.bootcloud.websocket.WebSocketHandler
import com.spring.bootcloud.websocket.WebSocketService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry
import javax.annotation.PostConstruct

/*
	Kotlin代码
 */
@SpringBootApplication
@RestController
@EnableWebSocket
@ServletComponentScan
class BootCloudApplication: WebSocketConfigurer{


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

	override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
		registry.addHandler(webSocketHandler(), "/echo").withSockJS()
	}

	@Bean
	fun webSocketService(): WebSocketService{
		return DefaultWebSocketService("You said \"%s\" !")
	}
	@Bean
	fun webSocketHandler(): WebSocketHandler{
		return WebSocketHandler(webSocketService())
	}
}

fun main(args: Array<String>) {
	runApplication<BootCloudApplication>(*args)
}


