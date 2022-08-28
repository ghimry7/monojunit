package com.monocept.model;

public class Player {
	private String name;
	private MarkType mark;
	
	public Player(String name) {
		super();
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMark(MarkType mark) {
		this.mark = mark;
	}

}
