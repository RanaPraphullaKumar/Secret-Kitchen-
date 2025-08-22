package com.restaurant.SecretKitchenApplication.Controller;

import com.restaurant.SecretKitchenApplication.Entity.Reservation;
import com.restaurant.SecretKitchenApplication.Service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    // Reserve table
    @PostMapping
    public String reserveTable(@RequestBody Reservation reservation) {
        reservationService.saveReservation(reservation);
        return "Your table reservation is confirmed!";
    }

    // View all reservations (for admin)
    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
}
