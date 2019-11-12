package com.ksqltomysql.iopsksqltomysql.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Entity
@Table(name = "bubbling_agg_data_lvl1")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"url_t", "count_t", "code_t", "time_t"},
        allowGetters = true)
public class BubblingAggDataLvl1 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String urlT;

    @Column(nullable = false, updatable = false)
    private  String countT;

    @Column(nullable = false, updatable = false)
    private String codeT;

    @Column(nullable = false, updatable = false)
    private String timeT;
}
