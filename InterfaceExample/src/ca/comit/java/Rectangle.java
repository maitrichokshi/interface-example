package ca.comit.java;

public class Rectangle implements Shape {
	
	private int length;
	private int width;
	
	Rectangle()
	{
		length = 6;
		width = 2;
	}

	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	@Override
	public double area() {
		return length * width;
	}

}
