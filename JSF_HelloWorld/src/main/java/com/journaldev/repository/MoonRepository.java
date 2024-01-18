package com.journaldev.repository;


import com.journaldev.domain.entity.Moon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoonRepository extends JpaRepository<Moon, Long> {
}
