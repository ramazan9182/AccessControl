package com.yjs3509.model;

public class MoreClassInTheCompilationUnit {

	
	public int getCalculatedValue(int coefficient) {
		return new B().a * coefficient;
		
	}
	
	public B getB() {
		return new B();
	}
	
}

class B{
	int a;
}

class C{
	
}

class D{
	
}
