package com.ksqltomysql.iopsksqltomysql.listener;
import com.ksqltomysql.iopsksqltomysql.dao.IGenericDao;
import com.ksqltomysql.iopsksqltomysql.entity.BubblingAggDataLvl1;
import com.ksqltomysql.iopsksqltomysql.entity.BubblingAggDataLvl2;
import com.ksqltomysql.iopsksqltomysql.entity.BubblingAggDataLvl3;
import com.ksqltomysql.iopsksqltomysql.entity.FiveMinutesAggData;
import com.ksqltomysql.iopsksqltomysql.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
    @Value("${spring.kafka.topics}")
    private String[] topics;

    @Value("${spring.kafka.topics1}")
    private String[] topics1;

    @Value("${spring.kafka.topics2}")
    private String[] topics2;

    @Value("${spring.kafka.topics3}")
    private String[] topics3;

    @Autowired
    private FiveMinutesAggDataRepository fiveMinutesAggDataRepository;

    @Autowired
    private BubblingRepo1 bubblingRepo1;

    @Autowired
    private BubblingRepo2 bubblingRepo2;

    @Autowired
    private BubblingRepo3 bubblingRepo3;

    @Autowired
    private EmployeeRepository employeeRepository;

   /* @Autowired
    private EntityNative entityNative;*/

    @KafkaListener(topics = "#{'${spring.kafka.topics}'.split(',')}", groupId="group_json", containerFactory="concurrentKafkaListenerContainerFactory")
    public void consumeJson(FiveMinutesAggData aggData) {
        System.out.println(aggData.getAggKey() + " Consumer has consumed in Json Format");
        fiveMinutesAggDataRepository.save(aggData);
    }

    @KafkaListener(topics = "#{'${spring.kafka.topics1}'.split(',')}", groupId="group_json", containerFactory="bubbling1ConcurrentKafkaListenerContainerFactory")
    public void consumeJsonBubbling1(BubblingAggDataLvl1 aggData) {
        System.out.println(aggData.getAggKey() + " Consumer has consumed in Json Format");
        bubblingRepo1.save(aggData);
    }

    @KafkaListener(topics = "#{'${spring.kafka.topics2}'.split(',')}", groupId="group_json", containerFactory="bubbling2ConcurrentKafkaListenerContainerFactory")
    public void consumeJsonBubbling2(BubblingAggDataLvl2 aggData) {
        System.out.println(aggData.getAggKey() + " Consumer has consumed in Json Format");
        bubblingRepo2.save(aggData);
    }

    @KafkaListener(topics = "#{'${spring.kafka.topics3}'.split(',')}", groupId="group_json", containerFactory="bubbling3ConcurrentKafkaListenerContainerFactory")
    public void consumeJsonBubbling3(BubblingAggDataLvl3 aggData) {
        System.out.println(aggData.getAggKey() + " Consumer has consumed in Json Format");
        //eğer topic isminde tablo yoksa yarat
            //varsa oraya save et
        bubblingRepo3.save(aggData);
        String topicName = "deneme_tablosu";
        //System.out.println(topics3.toString());
        //entityNative.createTableWithTopicName(topicName);
        employeeRepository.createTableWithTopicName(topicName);
    }
}
