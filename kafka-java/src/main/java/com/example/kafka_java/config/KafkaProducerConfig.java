package com.example.kafka_java.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public NewTopic createTopic(){
        return new NewTopic("topic2", 4, (short) 1); // Topic name, replication factor, partitions
    }



    @Bean
    public NewTopic topic1() {
        return new NewTopic("topic03", 4, (short) 1); // Topic name, partitions, replication factor
    }

    @Bean
    public NewTopic topic2() {
        return new NewTopic("topic04", 3, (short) 1); // Another topic with different configurations
    }

    @Bean
    public NewTopic topic3() {
        return new NewTopic("topic05", 2, (short) 1); // Add as many topics as needed
    }
}
