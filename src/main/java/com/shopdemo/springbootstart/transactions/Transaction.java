package com.shopdemo.springbootstart.transactions;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	private String transactionId;
	private String customerId;
	private List<String> productId;
	private BigDecimal totalCost;
	private Date transactionDate;
	
	
	
	
	
	public Transaction(String transactionId, String customerId, List<String> productId, BigDecimal totalCost,
			Date transactionDate) {
		super();
		this.transactionId = transactionId;
		this.customerId = customerId;
		this.productId = productId;
		this.totalCost = totalCost;
		this.transactionDate = transactionDate;
	}
	
	
	public Transaction() {
	}
	
	
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public List<String> getProductId() {
		return productId;
	}
	public void setProductId(List<String> productId) {
		this.productId = productId;
	}
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	
	
	
	
	

}
