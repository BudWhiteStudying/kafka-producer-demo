package com.budwhite.studying.kafka.producer.demo.producer;

import com.budwhite.studying.kafka.producer.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(Message message) {
        kafkaTemplate.send(message.getTopicName(), message.getBody());
    }
}
