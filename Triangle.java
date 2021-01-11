package chast4;

public class Triangle extends GeometricObject{

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	Triangle(String color, boolean filled){super(color,filled);}
	Triangle (double s1, double s2, double s3, String color, boolean filled){
		super(color,filled);
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	double getArea() {
	 double p = getPerimeter()/2;
	 return Math.sqrt(p*(p-side1));
	}
	
	public String triangleInfo() {
		return  "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

	}
}
