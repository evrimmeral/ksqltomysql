package com.ksqltomysql.iopsksqltomysql.repository;

import com.ksqltomysql.iopsksqltomysql.entity.BubblingAggDataLvl1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BubblingRepo1 extends JpaRepository<BubblingAggDataLvl1, Long> {


}
