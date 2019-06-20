package com.jpa.repository;

import com.jpa.entity.OneA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: zhaoyu
 * @CreateDate: 2019/6/19 14:45
 */
@Repository
public interface OneARepository extends JpaRepository<OneA, Long>, JpaSpecificationExecutor<OneA> {
}
