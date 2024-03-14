package com.hb.orderservice.springprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class KafkaConfig {

    @Value("${display.message}")
    private String message;

    @Bean
//    @Profile("prod")
    @ConditionalOnProperty(prefix = "app.active", name = "env", havingValue = "prod")
    public void prodKafkaConffig(){
        // init kafka
        System.out.println(message);
    }

    @Bean
//    @Profile("stg")
    @ConditionalOnProperty(prefix = "app.active", name = "env", havingValue = "stg")
    public void stgKafkaConffig(){
        // init kafka
        System.out.println(message);
    }

    @Bean
//    @Profile("canary")
    @ConditionalOnProperty(prefix = "app.active", name = "env", havingValue = "canary")
    public void canaryKafkaConffig(){
        // init kafka
        System.out.println(message);
    }

    @Bean
//    @Profile("dev")
    @ConditionalOnProperty(prefix = "app.active", name = "env", havingValue = "dev")
    public void devKafkaConffig(){
        // init kafka
        System.out.println(message);
    }
}
