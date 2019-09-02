package com.task.task.Repository;

import com.task.task.Entity.Queries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QueryRepository extends JpaRepository<Queries, Long> {


    @Query(value = "select * from queries where id =?1",nativeQuery = true)
    Queries getById(Long id);
}
