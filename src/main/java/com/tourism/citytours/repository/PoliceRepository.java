package com.tourism.citytours.repository;

import com.tourism.citytours.model.Police;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliceRepository extends JpaRepository<Police, Long> {
}
