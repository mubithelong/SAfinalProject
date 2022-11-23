package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.beans.BeanProperty;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic bookAddedTopic(){
        return TopicBuilder.name("bookAdded")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
