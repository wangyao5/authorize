package com.letv.repository;

import com.letv.entity.LittleCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LittleCategoryRepository extends JpaRepository<LittleCategoryEntity, Long> {
}
