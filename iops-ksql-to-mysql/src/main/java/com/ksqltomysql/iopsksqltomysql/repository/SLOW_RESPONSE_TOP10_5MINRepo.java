package com.ksqltomysql.iopsksqltomysql.repository;

import com.ksqltomysql.iopsksqltomysql.entity.SLOW_RESPONSE_TOP10_5MIN;
import com.ksqltomysql.iopsksqltomysql.model.BubblingAggDataLvl1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SLOW_RESPONSE_TOP10_5MINRepo extends JpaRepository<SLOW_RESPONSE_TOP10_5MIN, Long> {


}
