package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

class ListTest {
	


	@Test
	void testMockList() {
		List mockList=mock(List.class);
		when(mockList.size()).thenReturn(2);
		
		assertEquals(2, mockList.size());
		
	}
	
	@Test
	void testMockListMultiValue() {
		List mockList=mock(List.class);
		when(mockList.size()).thenReturn(2).thenReturn(3);
		
		assertEquals(2, mockList.size());
		assertEquals(3, mockList.size());
		
	}
	
	@Test
	void testMockListGetAny() {
		List mockList=mock(List.class);
		when(mockList.get(anyInt())).thenReturn(2).thenReturn(3);
		
		assertEquals(2, mockList.get(0));
		assertEquals(3, mockList.get(1));
		
	}
	
	@Test
	void testMockListGetAnyException() {
		List mockList=mock(List.class);
		when(mockList.get(anyInt())).thenThrow(new RuntimeException("Something occured"));
		
		assertThrows(RuntimeException.class,()->mockList.get(0));
		
			
	}

}
