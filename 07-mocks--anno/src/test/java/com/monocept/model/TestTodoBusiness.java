package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestTodoBusiness {
	
	@Mock
	ITodoService todoServiceMock;

	@Test
	public void testretrieveTodosRelatedToSpringMocks() {
		
		List<String> todos=Arrays.asList("MVC Spring Boot","Java Spring","MVC");
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusiness todoBusiness=new TodoBusiness(todoServiceMock);
		
		
		
		List<String> filteredTodos=todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
		
	}

}
