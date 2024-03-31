package com.example.CPS.service;

import com.example.CPS.model.Feedback;
import com.example.CPS.repository.CourseRepository;
import com.example.CPS.repository.FeedbackRepository;
import com.example.CPS.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeedbackServiceImpl implements FeedbackService{

    @Autowired
    FeedbackRepository feedbackRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void giveFeedback(Integer studentId,Integer courseId, String feedback) {
        Feedback newFeedback = new Feedback();
        newFeedback.setCourse(courseRepository.findById(courseId).get());
        newFeedback.setStudent(studentRepository.findById(studentId).get());
        newFeedback.setFeedBack(feedback);
        feedbackRepository.save(newFeedback);

    }
}
