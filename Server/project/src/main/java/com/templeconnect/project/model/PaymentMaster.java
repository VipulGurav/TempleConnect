package com.templeconnect.project.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="payment_master")
public class PaymentMaster {
	@Id 
	private Long paymentId;
    private Double amount;
    private String transactionId;
    private Long userId;
    private LocalDateTime time;
	
    public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public PaymentMaster(Long paymentId, Double amount, String transactionId, Long userId, LocalDateTime time) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.transactionId = transactionId;
		this.userId = userId;
		this.time = time;
	}
	
   
}
