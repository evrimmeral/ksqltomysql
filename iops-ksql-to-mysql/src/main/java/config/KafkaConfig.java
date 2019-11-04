package config;

import listener.CustomErrorHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;

@Configuration
public class KafkaConfig {

    @Bean
    public KafkaListenerErrorHandler customErrorHandler() {
        return new CustomErrorHandler();
    }
}
