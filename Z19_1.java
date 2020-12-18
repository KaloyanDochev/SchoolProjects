package chast4;

public class Z19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person person = new Person("George" , "Novi iskur" , 849, "george@gmail.com");
       Student student = new Student("George" , "Novi iskur" , 849, "george@gmail.com", "freshman");
       Employee employee= new Employee("George" , "Novi iskur" , 849, "george@gmail.com", 2000, "ofis", 2001);
       Faculty faculty= new Faculty("George" , "Novi iskur" , 849, "george@gmail.com", 2000, "ofis", 2001, 8 , "schetovoditel");
       Staff staff= new Staff("George" , "Novi iskur" , 849, "george@gmail.com", 2000, "ofis", 2001, "chistach");
       
       person.toString();
       student.toString();
       employee.toString();
       faculty.toString();
       staff.toString();
	}

}
