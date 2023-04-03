package com.crs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crs.main.model.Feedbacks;

public interface FeedbackRepository extends JpaRepository<Feedbacks, Integer> {

}
