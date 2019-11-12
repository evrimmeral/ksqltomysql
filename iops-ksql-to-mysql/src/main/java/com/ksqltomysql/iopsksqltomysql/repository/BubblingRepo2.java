package com.ksqltomysql.iopsksqltomysql.repository;

import com.ksqltomysql.iopsksqltomysql.model.BubblingAggDataLvl2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BubblingRepo2 extends JpaRepository<BubblingAggDataLvl2, Long> {

}
