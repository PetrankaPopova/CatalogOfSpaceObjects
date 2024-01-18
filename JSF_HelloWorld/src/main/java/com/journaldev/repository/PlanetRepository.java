package com.journaldev.repository;


import com.journaldev.domain.entity.Moon;
import com.journaldev.domain.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
    List<Planet> getAllPlanet();
}
