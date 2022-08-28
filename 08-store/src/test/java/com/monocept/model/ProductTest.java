package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	
	Product product;
	
	@BeforeEach
	void createObj() {
		product=new Product(1,"Banana",50.0,0.2);
	}
	@Test
	void testPriceAfterDiscount() {
		assertEquals(40,product.calPriceAfterDis());
	}
	

}
