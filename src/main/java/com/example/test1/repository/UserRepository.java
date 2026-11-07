package com.example.test1.repository;

import com.example.test1.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Modifying
    @Transactional
    @Query(value = "TRUNCATE TABLE users RESTART IDENTITY", nativeQuery = true)
    void truncateTable();
}
