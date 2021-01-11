package chast4;

public class Student extends Person {
String status;
	Student(String name, String address, int number, String email, String status) {
		super(name, address, number, email);
		this.status = status;
	}
	public String toString() {
		return  super.toString() + 
				" Status " + status;
	}
}
