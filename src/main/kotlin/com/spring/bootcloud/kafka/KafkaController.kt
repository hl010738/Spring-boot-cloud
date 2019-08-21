package com.spring.bootcloud.kafka

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping(value = ["/kafka"], produces = [MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE])
class KafkaController {

    @Autowired
    var producer: Producer? = null

    @PostMapping(value = ["/message2"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun sendKafkaMessage(@RequestBody message: Message): Message{
        message.date = Date()
        this.producer?.sendMessage(message)
        return message
    }

    @RequestMapping(value = ["/message"], method = [RequestMethod.GET])
    fun sendKafkaMessage(@RequestParam(name = "id") id: Long,
                         @RequestParam(name = "name") name: String): Message{

        println("Send Kafka Message invoked")

        var message = Message()
        message.id = id
        message.name = name
        message.date = Date()

        this.producer?.sendMessage(message)

        return message
    }
}