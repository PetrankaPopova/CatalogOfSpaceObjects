package com.space.repository;


import com.space.domain.entity.Star;

import com.space.domain.entity.enums.StarClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StarRepository extends JpaRepository<Star, Long> {
    List<Star> getAllStar();

    List<Star> findByNameAndStarClass(String name, StarClass starClass);

    List<Star> findByName(String name);

    List<Star> findByStarClass(StarClass starClass);
}
