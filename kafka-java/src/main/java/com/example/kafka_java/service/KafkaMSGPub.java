package com.example.kafka_java.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMSGPub {
    @Autowired
    private KafkaTemplate<String ,Object> kafkaTemplate;

    public void sendMessage(String message) {
       CompletableFuture<SendResult<String,Object>> feature= kafkaTemplate.send("topic2", message);
       feature.whenComplete((result,exeption) -> {
           if(exeption!=null){
               System.out.println("Error while sending message: "+exeption.getMessage());
           }else{
               System.out.println("topic is :"+result.getRecordMetadata().topic()+"partition is:"+result.getRecordMetadata().partition()+"offcet is: "+result.getRecordMetadata().offset()+"Message sent successfully: "+result);
           }
       });
    }

    public void sendMessage2(String message) {
        CompletableFuture<SendResult<String,Object>> feature= kafkaTemplate.send("topic03", message);
        feature.whenComplete((result,exeption) -> {
            if(exeption!=null){
                System.out.println("Error while sending message: "+exeption.getMessage());
            }else{
                System.out.println("topic is :"+result.getRecordMetadata().topic()+"partition is:"+result.getRecordMetadata().partition()+"offcet is: "+result.getRecordMetadata().offset()+"Message sent successfully: "+result);
            }
        });
    }

}
