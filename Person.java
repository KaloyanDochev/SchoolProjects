package chast4;

public class Person {
String name;
String address;
int number;
String email;

Person( String name, String address, int number, String email){
	this.address = address;
	this.name = name;
	this.number = number;
	this.email = email;
}

public String toString() {
	return "Name " + name + 
			" Adress " + address + 
			" Number " + number +
			" E-mail " + email;
}

}
