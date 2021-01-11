package chast4;

public class Z18 {
	public static void main (String args[]) {
	
		Triangle tr = new Triangle(2.3, 3.0, 4.3, "green", true);
		tr.triangleInfo();
		System.out.println("Perimeter " + tr.getPerimeter() + 
				           " Area " + tr.getArea() + 
				            " Color " + tr.getColor() + 
				            " Filled? " + tr.isFilled());
	}
}
