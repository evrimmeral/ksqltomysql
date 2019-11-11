package com.ksqltomysql.iopsksqltomysql.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "bubbling_agg_data_lvl2")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"from_date", "to_date", "agg_key", "agg_value","ek_data"},
        allowGetters = true)
public class BubblingAggDataLvl2 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String fromDate;

    @Column(nullable = false, updatable = false)
    private  String toDate;

    @Column(nullable = false, updatable = false)
    private String aggKey;

    @Column(nullable = false, updatable = false)
    private String aggValue;

    @Column(nullable = false, updatable = false)
    private String ekData;
}
