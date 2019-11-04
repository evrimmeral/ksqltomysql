package repository;

import entity.FiveMinutesAggData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiveMinutesAggDataRepository extends JpaRepository<FiveMinutesAggData, Long> {

}
