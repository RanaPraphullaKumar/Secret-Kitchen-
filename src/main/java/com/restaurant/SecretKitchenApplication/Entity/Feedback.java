package com.restaurant.SecretKitchenApplication.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    @Column(nullable = false)
    private String comments;
    private String email;
	public Feedback() {
		super();
	}
	public Feedback(Long id, String customerName, String comments, String email) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.comments = comments;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", customerName=" + customerName + ", comments=" + comments + ", email=" + email
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
}
