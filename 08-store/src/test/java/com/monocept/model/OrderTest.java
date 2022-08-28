package com.monocept.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTest {
	
	Product product1;
	LineItem item1;
	Product product2;
	LineItem item2;
	Order order;
	@BeforeEach
	void createObj() {
		product1 = new Product(1, "Banana", 50.0, 0.2);
		item1 = new LineItem(11, 5, product1);
		product2 = new Product(2, "Biscuit", 100.0, 0.2);
		item2 = new LineItem(12, 5, product2);
		order=new Order(101,"22/08/2022");
		order.addLineItem(item1);
		order.addLineItem(item2);
	}

	@Test
	void testCalOrderPrice() {
		assertEquals(600, order.calOrderPrice());
	}

}
