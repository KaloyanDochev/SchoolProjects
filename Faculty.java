package chast4;

public class Faculty extends Employee {
int officeHours;
String rank;
	Faculty(String name, String address, int number, String email, int salary, String office, int dateHired, int officeHours, String rank) {
		super(name, address, number, email, salary, office, dateHired);
		// TODO Auto-generated constructor stub
		this.officeHours = officeHours;
		this.rank = rank;
	}
	public String toString() {
		return  super.toString() + 
				" office hours " + officeHours + 
				"rank " + rank;
	}
}
