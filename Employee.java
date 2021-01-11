package chast4;

public class Employee extends Person {
int salary;
String office;
int dateHired;
	Employee(String name, String address, int number, String email, int salary, String office, int dateHired) {
		super(name, address, number, email);
		// TODO Auto-generated constructor stub
		this.salary = salary;
		this.office = office;
		this.dateHired = dateHired;
	}
	public String toString() {
		return  super.toString() + 
				" Salary " + salary + 
				" office " + office +
				" date hired" + dateHired;
	}

}
