package com.ksqltomysql.iopsksqltomysql.service;

import com.ksqltomysql.iopsksqltomysql.dao.IGenericDao;
import com.ksqltomysql.iopsksqltomysql.entity.FiveMinutesAggData;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericService {
    IGenericDao<FiveMinutesAggData> dao;

    @Autowired
    public void setDao(IGenericDao<FiveMinutesAggData> daoToSet) {
        dao = daoToSet;
        dao.setClazz(FiveMinutesAggData.class);
    }

}
