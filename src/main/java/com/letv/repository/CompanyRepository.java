package com.letv.repository;

import com.letv.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    @Modifying
    @Query(value = "update t_company comp set comp.name =:name where comp.id =:id", nativeQuery = true)
    int update(@Param("id") long id, @Param("name") String name);
}
