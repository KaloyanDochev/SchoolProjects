package Sets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//7.1:
//append - slagame nov element v kraq na lista
//insert after -  slagame nov element na dadena poziciq
public class Z7_2 {
	public static void main(String[] args) throws FileNotFoundException {
LinkedList<String> dumi = new LinkedList<String>(); 
File file = new File("src/Sets/Z7_2.java");
Scanner sc = new Scanner(file);
while(sc.hasNext()) {
	dumi.add(sc.next());
}
Collections.sort(dumi);
System.out.println(dumi);
	}
}
