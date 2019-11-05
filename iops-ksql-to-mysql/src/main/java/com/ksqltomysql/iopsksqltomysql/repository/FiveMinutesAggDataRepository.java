package com.ksqltomysql.iopsksqltomysql.repository;

import com.ksqltomysql.iopsksqltomysql.entity.FiveMinutesAggData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiveMinutesAggDataRepository extends JpaRepository<FiveMinutesAggData, Long> {

}
