package learnMethods;

public class ShapesSum{
	final double pi = 3.14;

	// Area of Square
	// Independent Method
	double areaOfSquare(double a) {
		double area = a * a;
		System.out.println("AreaOfSquare =" + area);
		System.out.println();
		return area;
	}

	// volume of Cube
	/*
	 * his is dependent method because this method depending on area of square and
	 * it is not working without area of square method
	 */
	double volumeOfCube(double a) {
		double volume = a * areaOfSquare(a);
		System.out.println("Volume of Cube =" + volume);
		System.out.println();
		return volume;
	}
	// Independent method for Volume Of Cube
	// this method works without another method

	double IndvolumeOfCube(double a) {

		double volume = a * a * a;
		System.out.println("volume of cube =" + volume);
		return volume;
	}

	// formula for volume of cylinder pi*r*r*h;
	double volumeOfCylinder(double radius, double height) {
		double volume = pi * radius * radius * height;
		System.out.println("Volume Of Cylinder =" + volume);
		return volume;
	}
//this method depending on volume of cylinder method
	double volumeOfCone(double radius,double height) {
		double volume=1.0/3.0*volumeOfCylinder(radius,height);
		System.out.println("volume of cone ="+volume);
		return volume;
	}
//1.how many square in rectangle 
		int squareInRectangle(int side,int length,int breadth) 
		{
			int areaOfSquare=side*side;
		int areaOfRectangle=length*breadth;
		int numberOfsquareInRectangle= areaOfRectangle/areaOfSquare;
		System.out.println("numberOfsquareInRectangle =  "+numberOfsquareInRectangle);
		return numberOfsquareInRectangle;
		}
		
		/*2.how many rectangle can be accommodated in square of side 
		8cm,rectangle length is 8cm,breadth is 4cm */
		int rectangleInSquare(int side,int length,int breadth)
		{
			int areaOfSquare=side*side;
			int areaOfRectangle=length*breadth;
			int recInsq=areaOfSquare/areaOfRectangle;
			System.out.println("rectangleInSquare ="+recInsq);
			return recInsq;
		}
		//find area of circle whose radius is 7.5cm
		double areaOfCircle(double radius) {
			double area=pi*radius*radius;
			System.out.println("area ="+area);
			return area;
			
		}
	public static void main(String[] args) {

		ShapesSum Ss = new ShapesSum();
		Ss.areaOfSquare(5);
		Ss.volumeOfCube(10);
		Ss.IndvolumeOfCube(10);
		Ss.volumeOfCylinder(10, 5);
		Ss.volumeOfCone(5, 5);
		Ss.squareInRectangle(10,100,5);
		Ss.rectangleInSquare(8, 8, 4);
		Ss.areaOfCircle(7.5);
		
	}


}
