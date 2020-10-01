package Zad;
import java.util.Scanner;

public class Zad7_1 {
public static void main (String[] args) {
	String string1, string2;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Word 1?");
	string1=sc.nextLine();
	System.out.println("Word 2?");
	string2=sc.nextLine();
	
	
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    int count[] = new int[CHARACTER_RANGE];
	    for (int i = 0; i < string1.length(); i++) {
	        count[string1.charAt(i)]++;
	        count[string2.charAt(i)]--;
	    }
	    for (int i = 0; i < CHARACTER_RANGE; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	
}
}
