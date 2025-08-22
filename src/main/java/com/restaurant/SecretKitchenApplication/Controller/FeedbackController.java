package com.restaurant.SecretKitchenApplication.Controller;

import com.restaurant.SecretKitchenApplication.Entity.Feedback;
import com.restaurant.SecretKitchenApplication.Service.FeedbackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    // Submit feedback
    @PostMapping
    public String submitFeedback(@RequestBody Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "Thank you for your feedback!";
    }

    // View all feedback (for admin)
    @GetMapping
    public List<Feedback> getAllFeedback() {
        return feedbackService.getAllFeedback();
    }
}
