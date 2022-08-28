package com.monocept.model;

import java.util.*;

public class Customer {
	private int id;
	private String name;
	List<Order> orders;

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		orders = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public int getOrderCounts() {
		return orders.size();
	}

	public void dispCust() {
		int c=1;
		double totalAmount=0;
		System.out.print("Customer \nID: " + id + "| Name: " + name + "| Order Counts: " + getOrderCounts());
		for(Order order:orders){
			totalAmount+=order.calOrderPrice();
		}
		System.out.println("| Total Amount: "+totalAmount);
		for (Order order : orders) {
			System.out.println("-------------------------------------------------------------\nOrder:" + c++ + "\n-------------------------------------------------------------");
			order.dispOrder();
		}
	}

}
