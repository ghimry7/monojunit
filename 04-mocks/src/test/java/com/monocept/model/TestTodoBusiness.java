package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class TestTodoBusiness {

	@Test
	public void testretrieveTodosRelatedToSpringMocks() {
		
		
		ITodoService todoServiceMock=mock(ITodoService.class);
		
		List<String> todos=Arrays.asList("MVC Spring Boot","Java Spring","MVC");
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusiness todoBusiness=new TodoBusiness(todoServiceMock);
		
		List<String> filteredTodos=todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
		
	}

}
