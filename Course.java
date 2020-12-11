package OOP;

public class Course {
private String courseName;
private String[] students ;
private int numberOfStudents = 0;

public Course(String name) {
	 courseName = name;;
}

public String getCourseName() {
	return courseName;
}

public void addStudent(String student) {
	numberOfStudents+=1;
	students[numberOfStudents] = student;
}

public void dropStudent(String student) {
	String[] copy = new String[numberOfStudents - 1];

	for (int i = 0, j = 0; i < numberOfStudents ; i++) {
	    if (student != students[i] ) {
	        copy[j++] = students[i];
	    }
	}
	students = copy;
	numberOfStudents-=1;
}

public String[] getStudents() {
	return students;
}

public int getNumberOfStudents() {
	return numberOfStudents;
}

}
