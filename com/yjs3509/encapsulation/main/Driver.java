package com.yjs3509.encapsulation.main;

import com.yjs3509.encapsulation.Circle;
import com.yjs3509.encapsulation.EncapsulatedData;

public class Driver {

	public static void main(String[] args) {
		
		EncapsulatedData data = new EncapsulatedData();
//		data.value = 456;
		
		Circle circle = new Circle();
//		circle.radius = -1;
		circle.setRadius(-10);
		
		System.out.println(circle.getRadius());
		
	}
}
