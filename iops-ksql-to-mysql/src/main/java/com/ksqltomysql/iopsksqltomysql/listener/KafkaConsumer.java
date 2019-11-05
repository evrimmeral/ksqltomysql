package com.ksqltomysql.iopsksqltomysql.listener;
import com.ksqltomysql.iopsksqltomysql.entity.FiveMinutesAggData;
import com.ksqltomysql.iopsksqltomysql.repository.FiveMinutesAggDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
    @Autowired
    private FiveMinutesAggDataRepository fiveMinutesAggDataRepository;

    @KafkaListener(topics="topictirbu", groupId="group_json", containerFactory="concurrentKafkaListenerContainerFactory")
    public void consumeJson(FiveMinutesAggData aggData) {
        System.out.println(aggData.getAggKey() + " Consumer has consumed in Json Format");
        fiveMinutesAggDataRepository.save(aggData);

    }
}
