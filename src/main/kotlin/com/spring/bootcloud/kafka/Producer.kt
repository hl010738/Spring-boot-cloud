package com.spring.bootcloud.kafka

import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class Producer {

    @Autowired
    var kafkaTemplate: KafkaTemplate<String, String>? = null

    fun sendMessage(message: Message){
        this.kafkaTemplate?.send("myTopic", Gson().toJson(message))
    }
}