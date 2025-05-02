package com.tourism.citytours.repository;

import com.tourism.citytours.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}

