package com.spring.bootcloud.kafka

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Consumer {

    @KafkaListener(topics = ["myTopic"], groupId = "myGroup")
    fun getMessage(consumerRecord: ConsumerRecord<String, String>){
        println("getMessage invoked")

        var topic = consumerRecord.topic()
        var key = consumerRecord.key()
        var value = consumerRecord.value()
        var partition = consumerRecord.partition()
        var timestamp = consumerRecord.timestamp()

        println("topic: $topic, key: $key, value: $value, partition: $partition, timestamp: $timestamp")

        println("=======================")
    }
}