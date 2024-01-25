package com.templeconnect.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking_master")
public class BookingMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long paymentId;
	String rPayId;
	Long amount;
	Long userId;
	String placeName;
	Integer adultCount;
	Integer childCount;
	String dateTime;

	public BookingMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getrPayId() {
		return rPayId;
	}

	public void setrPayId(String rPayId) {
		this.rPayId = rPayId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public BookingMaster(Long paymentId, String rPayId, Long amount, Long userId, String placeName, Integer adultCount,
			Integer childCount, String dateTime) {
		super();
		this.paymentId = paymentId;
		this.rPayId = rPayId;
		this.amount = amount;
		this.userId = userId;
		this.placeName = placeName;
		this.adultCount = adultCount;
		this.childCount = childCount;
		this.dateTime = dateTime;
	}

}
