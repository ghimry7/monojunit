package com.monocept.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class TestTodoBusiness {

	@Test
	public void testretrieveTodosRelatedToSpringMocks() {
		
		//Given
		ITodoService todoServiceMock=mock(ITodoService.class);
		
		List<String> todos=Arrays.asList("MVC Spring Boot","Java Spring","MVC");
		
		given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
		
		TodoBusiness todoBusiness=new TodoBusiness(todoServiceMock);
		
		
		//when
		List<String> filteredTodos=todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		
		
		//then
		assertThat(filteredTodos.size(),is(2));
		
	}
	
	@Test
	void testMockListGetAny() {
		//Given
		List mockList=mock(List.class);
		given(mockList.get(anyInt())).willReturn(2).willReturn(3);
		
		//When
		 int a=(int) mockList.get(0);
		 int b=(int) mockList.get(1);
		 
		 
		 //then
		assertThat(a,is(2));
		assertThat(b,is(3));
		
	}

}
