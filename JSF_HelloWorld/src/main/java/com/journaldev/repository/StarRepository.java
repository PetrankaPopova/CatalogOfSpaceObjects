package com.journaldev.repository;


import com.journaldev.domain.entity.Planet;
import com.journaldev.domain.entity.Star;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StarRepository extends JpaRepository<Star, Long> {
    List<Star> getAllStar();
}
