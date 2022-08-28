package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LineItemTest {

	Product product;
	LineItem item;

	@BeforeEach
	void createObj() {
		product = new Product(1, "Banana", 50.0, 0.2);
		item = new LineItem(11, 5, product);
	}

	@Test
	void testCalLineItemPrice() {
		assertEquals(200, item.calculateLineItemCost());
	}
}
