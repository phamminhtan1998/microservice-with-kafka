package com.phamtan.nrmnotify.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafForgetPasswordCons {

    @KafkaListener(groupId = "vimo_check_risk", topics = "forget-password-topic",containerFactory = "kafkaStringContainer")
    public String forgetPassword(@Payload String user){
        System.out.println(user);
        return user ;
    }
}
