package com.example.Assignment.Spring_with_Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final String TOPIC ="Test_topic" ;
    @Autowired
    private KafkaTemplate<String,String> KafkaTemplate;

    public void sendMessage(String message)
    {
        this.KafkaTemplate.send(TOPIC,message);
    }
}
