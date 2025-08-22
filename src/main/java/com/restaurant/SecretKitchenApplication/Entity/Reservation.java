package com.restaurant.SecretKitchenApplication.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String email;
    private String phone;
    private int seats;
    @Column(name = "reservation_date")
    private String reservationDate;
    @Column(name = "reservation_time")
    private String reservationTime;
	public Reservation() {
		super();
	}
	public Reservation(Long id, String customerName, String email, String phone, int seats, String reservationDate,
			String reservationTime) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.seats = seats;
		this.reservationDate = reservationDate;
		this.reservationTime = reservationTime;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", customerName=" + customerName + ", email=" + email + ", phone=" + phone
				+ ", seats=" + seats + ", reservationDate=" + reservationDate + ", reservationTime=" + reservationTime
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}

    
}
