package chast4;

public class Staff extends Employee {
String title;
	Staff(String name, String address, int number, String email, int salary, String office, int dateHired, String title) {
		super(name, address, number, email, salary, office, dateHired);
		// TODO Auto-generated constructor stub
		this.title = title;
	}
	public String toString() {
		return  super.toString() + 
				" title " + title;
	}
}
