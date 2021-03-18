package ca.comit.java;

public class TestShapes {

	public static void main(String[] args) {

		
		//Shape myCircle = new Circle();
		
		Square mySquare = new Square();
		
		Shape myShape;
		Shape myRectangle = new Rectangle();
		
		myShape = mySquare;
		
		System.out.println("Area of the circle is:" + myShape.area() );
		System.out.println("Area of the rectangle is:" + myRectangle.area() );
	}

}
