package com.restaurant.SecretKitchenApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.SecretKitchenApplication.Entity.CustomerOrder;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
}

