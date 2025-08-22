package com.restaurant.SecretKitchenApplication.Controller;

import com.restaurant.SecretKitchenApplication.Entity.CustomerOrder;
import com.restaurant.SecretKitchenApplication.Service.OrderService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Place new order
    @PostMapping
    public CustomerOrder placeOrder(@Valid @RequestBody CustomerOrder order) {
        order.setPaymentMode("Cash on Delivery");
        return orderService.placeOrder(order); // return order with totalAmount + details
    }

    // View all orders (for admin)
    @GetMapping
    public List<CustomerOrder> getAllOrders() {
        return orderService.getAllOrders();
    }
}
