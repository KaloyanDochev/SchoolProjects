package Zad;

public class Z13_1 {

	public static void main(String[] args) {
Fan f1 = new Fan();
Fan f2 = new Fan();

f1.setSpeed(3);
f1.setSwitchedON(true);
f1.setColor("yellow");
f1.setRadius(10);
System.out.println(f1.toString());

System.out.println();

f2.setSwitchedON(false);
f2.setSpeed(2);
f2.setColor("blue");
f2.setRadius(5);
System.out.println(f2.toString());

	}

}
