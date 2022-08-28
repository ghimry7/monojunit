package com.monocept.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;



public class TestTodoBusiness {

	@Test
	public void testretrieveTodosRelatedToSpringStub() {
		ITodoService todoServiceStub=new TodoServiceStub();
		TodoBusiness todoBusiness=new TodoBusiness(todoServiceStub);
		
		List<String> filteredTodos=todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
		
	}

}
