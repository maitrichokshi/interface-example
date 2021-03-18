package ca.comit.java;

public class Square implements Shape {
	
	private int length;

	@Override
	public double area() {
		
		return length * length;
	}

}
