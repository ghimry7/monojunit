package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilTest {
	
	MathUtil obj;
//	@BeforeAll
//	void test() {
//		
//	}
	
	@BeforeEach
	void test() {
		obj=new MathUtil();
	}
	
//	@AfterEach
//	void test1() {
//		System.out.println("Hello");
//	}
	
//	@AfterAll
//	void test() {
//		
//	}
	
	@Test
	void testAddIntegers_testAdditionResult(){
		MathUtil obj=new MathUtil();
		int exp=10;
		int ac=obj.addInteger(5, 5);
		assertEquals(exp, ac);
	}
	
	@Test
	void testMul() {
		int exp=25;
		int ac=obj.mulInteger(5,5);
		assertEquals(exp,ac);
	}
	
	@Test
	@DisplayName("Divide Integers")
	void testDiv() {
		assertThrows(ArithmeticException.class, ()->obj.divInteger(10, 0));
	}
	
	@Test
	void testArray() {
		int[] exp= {1,2,3};
		assertArrayEquals(exp, exp);
	}
}
