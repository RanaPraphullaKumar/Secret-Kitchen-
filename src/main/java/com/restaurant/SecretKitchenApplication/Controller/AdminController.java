package com.restaurant.SecretKitchenApplication.Controller;

import com.restaurant.SecretKitchenApplication.Entity.CustomerOrder;
import com.restaurant.SecretKitchenApplication.Entity.Feedback;
import com.restaurant.SecretKitchenApplication.Entity.Reservation;
import com.restaurant.SecretKitchenApplication.Service.FeedbackService;
import com.restaurant.SecretKitchenApplication.Service.OrderService;
import com.restaurant.SecretKitchenApplication.Service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private FeedbackService feedbackService;

    // View all orders
    @GetMapping("/orders")
    public List<CustomerOrder> viewOrders() {
        return orderService.getAllOrders();
    }

    // View all reservations
    @GetMapping("/reservations")
    public List<Reservation> viewReservations() {
        return reservationService.getAllReservations();
    }

    // View all feedback
    @GetMapping("/feedback")
    public List<Feedback> viewFeedback() {
        return feedbackService.getAllFeedback();
    }
}
