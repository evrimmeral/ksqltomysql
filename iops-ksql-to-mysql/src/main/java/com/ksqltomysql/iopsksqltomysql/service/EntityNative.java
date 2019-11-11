/*package com.ksqltomysql.iopsksqltomysql.service;

import com.ksqltomysql.iopsksqltomysql.dao.IGenericDao;
import com.ksqltomysql.iopsksqltomysql.entity.BubblingAggDataLvl1;
import com.ksqltomysql.iopsksqltomysql.entity.FiveMinutesAggData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
@Repository
public class EntityNative extends JpaRepository<BubblingAggDataLvl1, Integer> {

    @Autowired
    private EntityManager em;

    @Transactional
    public void createTableWithTopicName(String topicName) {

        Query q = em.createNativeQuery("CREATE TABLE ?1 (FOO_ID NUMBER)");
        q.setParameter(1, topicName);
        q.executeUpdate();

    }

}*/
