package com.space.repository;


import com.space.domain.entity.Galaxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GalaxyRepository extends JpaRepository<Galaxy, Long> {

    List<Galaxy> getAllGalaxies();
}