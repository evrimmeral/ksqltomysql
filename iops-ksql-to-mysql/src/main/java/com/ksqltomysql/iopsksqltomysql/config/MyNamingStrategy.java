package com.ksqltomysql.iopsksqltomysql.config;

import org.hibernate.cfg.DefaultNamingStrategy;

public class MyNamingStrategy extends DefaultNamingStrategy {

    @Override
    public  String tableName(String tableName) {
        return tableName;
    }

}
