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
	
	int length = string1.length();
	
	char bukva[] = new char[length] ;
	for(int i = 0; i<length; i++) {
		bukva[i] = string1.charAt(i);
	}
	
	boolean IsAnagram=true;
	
	for(int i = 0; i<length; i++) {
		for(int j=0; j<length; j++) {
			if(bukva[j]==string2.charAt(i)) {
				bukva[j]=0;
				IsAnagram=true;
				break;
			}
			else {IsAnagram = false;}
		}
		if(IsAnagram==false) {break;}
	}
	
	if(IsAnagram==true) {
		System.out.println("Word 1 is an anagram of word 2.");
	}
	else {
			System.out.println("Word 1 isn't an anagram of word 2.");
	}
}
}
