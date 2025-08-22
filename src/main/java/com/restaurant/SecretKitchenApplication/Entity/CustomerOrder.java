package com.restaurant.SecretKitchenApplication.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "customer_orders")
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Customer name is required")
    private String customerName;

    @Email(message = "Invalid email")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Phone number is required")
    private String phone;

    @Column(length = 2000, nullable = false)
    @NotBlank(message = "Order details are required")
    private String orderDetails; // will hold list of dishes + quantities + prices

    @NotBlank(message = "Address is required")
    private String address;

    private String paymentMode = "Cash on Delivery";

    private double totalAmount; // NEW

    public CustomerOrder(Long id, @NotBlank(message = "Customer name is required") String customerName,
			@Email(message = "Invalid email") @NotBlank(message = "Email is required") String email,
			@NotBlank(message = "Phone number is required") String phone,
			@NotBlank(message = "Order details are required") String orderDetails,
			@NotBlank(message = "Address is required") String address, String paymentMode, double totalAmount) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.orderDetails = orderDetails;
		this.address = address;
		this.paymentMode = paymentMode;
		this.totalAmount = totalAmount;
	}

	public CustomerOrder() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getOrderDetails() { return orderDetails; }
    public void setOrderDetails(String orderDetails) { this.orderDetails = orderDetails; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
