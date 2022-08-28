package com.monocept.model;

public class Product {
	private int id;
	private String name;
	private double price;
	private double discount;
	
	public Product(int id, String name, double price, double d) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = d;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}
	
	public double calPriceAfterDis(){
		return price-(price*discount);
	}

	@Override
	public String toString() {
		return "ID:" + id + "| Name: " + name + "| Price: " + price + "| Discount: " + discount
				+ "| After Discount: " + calPriceAfterDis() ;
	}
	
	

	

	
	
	
	
	
}
