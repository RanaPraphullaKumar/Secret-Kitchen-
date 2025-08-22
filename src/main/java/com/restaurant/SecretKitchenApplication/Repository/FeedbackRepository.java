package com.restaurant.SecretKitchenApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.SecretKitchenApplication.Entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}

