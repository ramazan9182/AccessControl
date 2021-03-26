package com.yjs3509.encapsulation;

public class Square {

	private int a;
	private String color;
	
	
	public Square() {
		this(1);
	}
	
	public Square(int a) {
		// FIXME
		this.a = a;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
}
