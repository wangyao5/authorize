package com.letv.repository;

import com.letv.entity.WorkFlowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkFlowRepository extends JpaRepository<WorkFlowEntity, Long> {

    @Modifying
    @Query(value = "update t_work_flow work_flow set work_flow.name =:name where work_flow.id =:id", nativeQuery = true)
    int update(@Param("id") long id, @Param("name") String name);
}
