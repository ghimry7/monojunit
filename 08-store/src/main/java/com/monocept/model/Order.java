package com.monocept.model;

import java.util.*;

public class Order {
	private int id;
	private String date;
	List<LineItem> items;

	public Order(int id, String date) {
		super();
		this.id = id;
		this.date = date;
		items = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public void addLineItem(LineItem item) {
		items.add(item);
	}

	public int itemCounts() {
		return items.size();
	}

	public double calOrderPrice() {
		double totalPrice = 0;
		for (LineItem item : items) {
			totalPrice += item.calculateLineItemCost();
		}
		return totalPrice;
	}

	public void dispOrder() {

		System.out.println("ID: " + id + "| Date: " + date + "| Item Counts: " + itemCounts() + "| Order Total Price: "
				+ calOrderPrice() + "\n-------------------------------------------------------------");
		System.out.println("Items\n-------------------------------------------------------------");
		for (LineItem item : items) {

			System.out.println(item);

		}

	}

}
