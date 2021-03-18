package ca.comit.java;

public class TestVehicleInterface {

	public static void main(String[] args) {

		
		Plane myPlane = new Plane();
		Car myCar = new Car();
		
		Vehicle myVehicle;
		
		//myPlane.start();
		//myPlane.stop();
		
		//myPlane.getName();  // valid
		
		//myVehicle = myPlane;
		myVehicle = myCar;
		
		myVehicle.start();
		myVehicle.stop();
		
		//myVehicle.getName(); // invalid
		
		//Vehicle myVehicle2 = new Plane();
		
		
		//Create an interface Shape with methods to calculate the area of the shape.
		//Create Circle and Rectangle classes that implement the Shape interface.
		//Create the instance of the Shape class to display the area of Circle(PI*r*r) and Rectangle(l*w).
		System.out.println();
	}

}
