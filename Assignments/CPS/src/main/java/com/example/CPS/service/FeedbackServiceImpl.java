package com.example.CPS.service;

import com.example.CPS.model.Feedback;
import com.example.CPS.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class FeedbackServiceImpl implements FeedbackService{

    @Autowired
    FeedbackRepository feedbackRepository;
    @Override
    public void giveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);

    }
}
