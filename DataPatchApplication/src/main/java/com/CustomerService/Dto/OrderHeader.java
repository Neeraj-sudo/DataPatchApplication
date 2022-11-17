package com.CustomerService.Dto;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class OrderHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int OrderId;
	@Column
	private String OrderNumber;

	@Column
	private OrderHeaderStatus status;
	@Column
	private String CustomerId;

	@Column
	private LocalDateTime OrderDate;

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getOrderNumber() {
		return OrderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}

	public OrderHeaderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderHeaderStatus status) {
		this.status = status;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public LocalDateTime getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		OrderDate = orderDate;
	}

	public OrderHeader(int orderId, String orderNumber, OrderHeaderStatus status, String customerId,
			LocalDateTime orderDate) {
		super();
		OrderId = orderId;
		OrderNumber = orderNumber;
		this.status = status;
		CustomerId = customerId;
		OrderDate = orderDate;
	}
	
	
}


