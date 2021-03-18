package ca.comit.java;

public class Circle implements Shape
{
	private float radius;
	
	Circle()
	{
		radius = 10;
	}
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}
	

}
