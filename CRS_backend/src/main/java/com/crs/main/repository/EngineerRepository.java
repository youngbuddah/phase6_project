package com.crs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crs.main.model.Engineers;

public interface EngineerRepository extends JpaRepository<Engineers, String> {

}
