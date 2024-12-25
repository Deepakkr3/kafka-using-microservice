package com.example.kafka_java.controller;

import com.example.kafka_java.service.KafkaMSGPub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class EventController {


    @Autowired
    private KafkaMSGPub kafkaMSGPub;

    @GetMapping("/publish/{msg}")
    public ResponseEntity<?> sendMessage(@PathVariable String msg) {
        try{
           for(int i = 0; i <10000;i++){
               kafkaMSGPub.sendMessage(msg);
           }
            return ResponseEntity.ok("Message sent successfully"+msg);
        }
        catch (Exception e){
         return ResponseEntity.badRequest().body("Error occurred while sending message: "+e.getMessage());
        }
    }
    @GetMapping("/send/{msg}")
    public ResponseEntity<?> sendTonextTopic(@PathVariable String msg) {
        try{
            for(int i = 0; i <10000;i++){
                kafkaMSGPub.sendMessage2(msg);
            }
            return ResponseEntity.ok("Message sent successfully"+msg);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Error occurred while sending message: "+e.getMessage());
        }




    }
}
