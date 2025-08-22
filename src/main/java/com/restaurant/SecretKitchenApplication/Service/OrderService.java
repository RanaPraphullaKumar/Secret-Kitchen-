package com.restaurant.SecretKitchenApplication.Service;

import com.restaurant.SecretKitchenApplication.Entity.CustomerOrder;
import com.restaurant.SecretKitchenApplication.Repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public CustomerOrder placeOrder(CustomerOrder order) {
        order.setPaymentMode("Cash on Delivery"); // enforce COD
        return orderRepository.save(order);
    }

    public List<CustomerOrder> getAllOrders() {
        return orderRepository.findAll();
    }
}
