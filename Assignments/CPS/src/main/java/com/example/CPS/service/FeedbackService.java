package com.example.CPS.service;

import com.example.CPS.model.Feedback;

public interface FeedbackService {
    void giveFeedback( Integer studentId,Integer courseId,String feedback);
}
