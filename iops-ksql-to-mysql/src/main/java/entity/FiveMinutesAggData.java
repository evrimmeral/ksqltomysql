package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Getter
@Setter
@Entity
@Table(name = "five-minutes-agg-data")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"fromDate", "toDate", "key", "value"},
        allowGetters = true)
public class FiveMinutesAggData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String fromDate;

    @Column(nullable = false, updatable = false)
    private  String toDate;

    @Column(nullable = false, updatable = false)
    private String key;

    @Column(nullable = false, updatable = false)
    private String value;
}
