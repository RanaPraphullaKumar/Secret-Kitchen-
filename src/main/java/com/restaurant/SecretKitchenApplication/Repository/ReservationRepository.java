package com.restaurant.SecretKitchenApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.SecretKitchenApplication.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

