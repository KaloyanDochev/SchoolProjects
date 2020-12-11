package Zad;

public class Circle {
private double radius;
public Circle() {radius = 1;}
public Circle(double newRadius) {
	radius = newRadius;
}
public double getArea() {
	return Math.PI*radius*radius;
}
public double getPerimeter() {
	return Math.PI*radius*radius;
}
public void setRadius(double newRadius) {
	radius = newRadius;
}

private double getRadius() {
return radius;
}

}
