package com.monocept.model;

import java.util.Arrays;

import java.util.List;



public class TodoServiceStub implements ITodoService {

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("MVC Spring Boot","Java Spring","MVC");
	}

}
