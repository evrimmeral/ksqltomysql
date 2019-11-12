package com.ksqltomysql.iopsksqltomysql.repository;

import com.ksqltomysql.iopsksqltomysql.model.BubblingAggDataLvl1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<BubblingAggDataLvl1, Integer> {
    @Query(value = "CREATE TABLE ?1 (FOO_ID NUMBER)", nativeQuery = true)
    void createTableWithTopicName(String topicName);

   /* @Query("select e from Employee e")
    Stream<BubblingAggDataLvl1> findAllStream();

    @Async
    CompletableFuture<BubblingAggDataLvl1> findByName(String name);

    List<BubblingAggDataLvl1> employeesByIssueDescription(String description);



    @Query("select e from #{#entityName} e where e.name = :name1 or e.name = :name2")
    List<BubblingRepo1> findByNames(@Param("name1") String name1,
                               @Param("name2") String name2);
    @Modifying
    @Query("update Employee e set e.name = :name where e.address.city = :city")
    int updateNameForEmployeesFromCity(@Param("name") String name,
                                       @Param("city") String city);

    void deleteByAddress_Street(String street);

    @Modifying
    @Query("delete from Employee e where e.address.street = ?1")
    void deleteInBulkByStreet(String street);*/

}
