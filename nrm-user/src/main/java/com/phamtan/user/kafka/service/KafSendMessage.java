package com.phamtan.user.kafka.service;

import com.google.gson.Gson;
import com.phamtan.user.kafka.KafkaNameTopic;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafSendMessage<T> {
    private KafkaTemplate<String,String> kafkaTemplate ;

    public KafSendMessage(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String topic, String key , T data ){
        Gson gson = new Gson();
        ProducerRecord<String,String> record = new ProducerRecord<>("forget-password-topic",key,gson.toJson(data));
        kafkaTemplate.send(record);
    }

}
