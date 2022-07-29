package com.example.springboot.repository;

import com.example.springboot.domain.ResponsiveData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IndexRepository extends JpaRepository<ResponsiveData, Long> {

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "SELECT * FROM responsive_data r")
    List<ResponsiveData> findAllResponsiveData();

}
