package ca.comit.java;

public class Plane implements Vehicle {
	
	public String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public void start() {
		System.out.println("Plane has started");

	}

	@Override
	public void stop() {
		System.out.println("Plane has stopped");
	}

}
