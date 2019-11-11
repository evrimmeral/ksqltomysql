package com.ksqltomysql.iopsksqltomysql.repository;

import com.ksqltomysql.iopsksqltomysql.entity.BubblingAggDataLvl3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BubblingRepo3 extends JpaRepository<BubblingAggDataLvl3, Long> {

}
