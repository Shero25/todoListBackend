package com.example.BackendCode.repository;

import com.example.BackendCode.entity.Backend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackendRepo extends JpaRepository<Backend,Long> {
    //JpaRepo facilitates communication
}
