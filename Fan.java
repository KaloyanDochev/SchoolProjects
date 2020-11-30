package Zad;

public class Fan {
final int SLOW = 1;
final int MEDIUM = 2;
final int FAST = 3;
private int speed = 1;
private boolean switchedON = false;
private double radius = 5;
private String color = "blue";

public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}

public boolean isSwitchedON() {
	return switchedON;
}
public void setSwitchedON(boolean switchedON) {
	this.switchedON = switchedON;
}

public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
String speed1;
 Fan(){}

public String toString() {
	if (switchedON) {
		switch(speed) {
		case 1: speed1 = "SLOW";break;
		case 2: speed1 = "MEDIUM";break;
		case 3: speed1 = "FAST";break;
		default:speed1 = "Error";break;
		}
		return "The fan is on. \n Speed: " + speed1 + "\n Color: " + color + "\n Radius: " + radius;
	}
	else {
		return "The fan is off. \n Color: " + color + "\n Radius: " + radius;
	}
}

}
