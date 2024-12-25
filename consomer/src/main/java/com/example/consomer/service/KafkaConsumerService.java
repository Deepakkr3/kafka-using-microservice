package com.example.consomer.service;







import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service

public class KafkaConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);
    @KafkaListener(topics = "topic2",groupId = "group-A")
    public void consume1(String message) {
        logger.info("Consumed message1: {}", message);
        // Process the message here...
        // For example, save it to a database or perform some other operation.

    }

    @KafkaListener(topics = "topic2",groupId = "group-A")
    public void consume2(String message) {
        logger.info("Consumed message2: {}", message);
        // Process the message here...
        // For example, save it to a database or perform some other operation.

    }
    @KafkaListener(topics = "topic2",groupId = "group-A")
    public void consume3(String message) {
        logger.info("Consumed message3: {}", message);
        // Process the message here...
        // For example, save it to a database or perform some other operation.

    }
    @KafkaListener(topics = "topic2",groupId = "group-A")
    public void consume4(String message) {
        logger.info("Consumed message4: {}", message);
        // Process the message here...
        // For example, save it to a database or perform some other operation.

    }

    @KafkaListener(topics = "topic2",groupId = "group-A")
    public void consume5(String message) {
        logger.info("Consumed message5: {}", message);
        // Process the message here...
        // For example, save it to a database or perform some other operation.

    }

}
