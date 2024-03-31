package com.example.CPS.repository;

import com.example.CPS.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository  extends JpaRepository<Feedback,Integer> {
}
