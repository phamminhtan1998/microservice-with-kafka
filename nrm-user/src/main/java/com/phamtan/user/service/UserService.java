package com.phamtan.user.service;

import com.mifmif.common.regex.Generex;
import com.phamtan.user.contants.ResponseMessage;
import com.phamtan.user.entity.User;
import com.phamtan.user.kafka.KafkaNameTopic;
import com.phamtan.user.kafka.service.KafSendMessage;
import com.phamtan.user.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepo userRepo;
    private KafkaTemplate<String,String> kafkaTemplate ;


    public List<User> findAll(){
        return userRepo.findAll();
    }
    public User findById(String id ){
        return userRepo.findById(id).get();
    }
    public User createUser(User user){
        return userRepo.save(user);
    }

    public String  forgetPassword(String email){
        Generex generex = new Generex("([a-Z]|[0-9]){6}");
        String tempPassword = generex.random();
        User user = userRepo.findByEmail(email);
        if(user==null) {
            return ResponseMessage.USER_NOT_FOUND.getMessage();
        }
        user.setTempPassword(tempPassword);
        user.setLocked(true);

        KafSendMessage<User> kafSendMessage = new KafSendMessage<>(kafkaTemplate);
        kafSendMessage.sendMessage(KafkaNameTopic.FORGET_PASSWORD_USER_TOPIC.getName(),user.getId(),user);
        return "Send the forget password  , Please check the email  ";
    }


}
