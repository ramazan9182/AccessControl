package com.yjs3509.encapsulation;

public class Circle {

	public static String className = "Circle"; 
	private double radius;
	private String color;
	

	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		if(radius <= 0) return;
		this.radius = radius;
	}
	
	
	public void setRadius(double radius){
		if(radius <= 0) {
			System.err.println("Error ::: The radius can not be NEGATIVE !!");
			return;
		}
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}
