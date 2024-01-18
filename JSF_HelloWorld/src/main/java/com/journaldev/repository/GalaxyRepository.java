package com.journaldev.repository;


import com.journaldev.domain.entity.Galaxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GalaxyRepository extends JpaRepository<Galaxy, Long> {
}
