package com.example.demo.repository;

import com.example.demo.domain.BarCodeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DrugRepository extends JpaRepository<BarCodeData, Long> {

}

