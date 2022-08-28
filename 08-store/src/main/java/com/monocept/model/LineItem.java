package com.monocept.model;

public class LineItem {
	private int id;
	private int quantity;
	Product product;

	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public double calculateLineItemCost() {
		return product.calPriceAfterDis() * quantity;
	}

	@Override
	public String toString() {
		return "ID: " + id + "| Quanity: " + quantity + "| Total: " + calculateLineItemCost() + " \n Product: "
				+ product;
	}

}
