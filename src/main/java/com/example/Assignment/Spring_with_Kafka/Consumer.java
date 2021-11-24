package com.example.Assignment.Spring_with_Kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
@KafkaListener(topics = "Test_topic",groupId = "group-id")
    public void consumeMessage(String message)
    {
        System.out.println(message);
    }
}
