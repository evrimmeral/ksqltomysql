package com.ksqltomysql.iopsksqltomysql.config;

import com.ksqltomysql.iopsksqltomysql.entity.SLOW_RESPONSE_TOP10_5MIN;
import com.ksqltomysql.iopsksqltomysql.model.BubblingAggDataLvl1;
import com.ksqltomysql.iopsksqltomysql.model.BubblingAggDataLvl2;
import com.ksqltomysql.iopsksqltomysql.model.BubblingAggDataLvl3;
import com.ksqltomysql.iopsksqltomysql.entity.FiveMinutesAggData;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConfig {


    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        return new DefaultKafkaConsumerFactory<>(config);
    }

    // Below code is for consuming custom Json message based on model object
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {

        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();

        factory.setConsumerFactory(consumerFactory());

        return factory;
    }

    @Bean
    public ConsumerFactory<String, FiveMinutesAggData> userConsumerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new JsonDeserializer<>(FiveMinutesAggData.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, FiveMinutesAggData> concurrentKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, FiveMinutesAggData> kafkaListenerContainerFactoryfactory = new ConcurrentKafkaListenerContainerFactory<>();
        kafkaListenerContainerFactoryfactory.setConsumerFactory(userConsumerFactory());
        return kafkaListenerContainerFactoryfactory;
    }

    @Bean
    public ConsumerFactory<String, BubblingAggDataLvl1> bubbling1ConsumerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new JsonDeserializer<>(BubblingAggDataLvl1.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, BubblingAggDataLvl1> bubbling1ConcurrentKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, BubblingAggDataLvl1> bubbling1kafkaListenerContainerFactoryfactory = new ConcurrentKafkaListenerContainerFactory<>();
        bubbling1kafkaListenerContainerFactoryfactory.setConsumerFactory(bubbling1ConsumerFactory());
        return bubbling1kafkaListenerContainerFactoryfactory;
    }

    @Bean
    public ConsumerFactory<String, BubblingAggDataLvl2> bubbling2ConsumerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new JsonDeserializer<>(BubblingAggDataLvl2.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, BubblingAggDataLvl2> bubbling2ConcurrentKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, BubblingAggDataLvl2> bubbling2kafkaListenerContainerFactoryfactory = new ConcurrentKafkaListenerContainerFactory<>();
        bubbling2kafkaListenerContainerFactoryfactory.setConsumerFactory(bubbling2ConsumerFactory());
        return bubbling2kafkaListenerContainerFactoryfactory;
    }

    @Bean
    public ConsumerFactory<String, SLOW_RESPONSE_TOP10_5MIN> bubbling3ConsumerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        return new DefaultKafkaConsumerFactory<>(config, new StringDeserializer(), new JsonDeserializer<>(SLOW_RESPONSE_TOP10_5MIN.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, SLOW_RESPONSE_TOP10_5MIN> bubbling3ConcurrentKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, SLOW_RESPONSE_TOP10_5MIN> bubbling3kafkaListenerContainerFactoryfactory = new ConcurrentKafkaListenerContainerFactory<>();
        bubbling3kafkaListenerContainerFactoryfactory.setConsumerFactory(bubbling3ConsumerFactory());
        return bubbling3kafkaListenerContainerFactoryfactory;
    }

}