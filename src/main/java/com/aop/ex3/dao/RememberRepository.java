package com.aop.ex3.dao;

import com.aop.ex3.domain.RememberTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Layer through which we communicate with the database
 * */
@Repository
public interface RememberRepository extends CrudRepository<RememberTable, Long> {
    boolean existsByResult(String result);
}
