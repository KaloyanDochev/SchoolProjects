package Sets;

import java.util.*;
import java.io.*;

public class VowelsCount {
	public static void main(String[] args) throws Exception {
		File file = new File("src/Sets/VowelsCount.java");
		if (file.exists()) {
			System.out.println("The number of vowels is " + countVowels(file));
		} else {
			System.out.println("File does not exist");
		}

	}

	public static int countVowels(File file) throws Exception {
// Array of all Java keywords + true, false and null
		Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		Set<Character> vowelSet = new HashSet<Character>(Arrays.asList(vowels));
		int count = 0;
		String x ="";
		char letter;
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			x=input.next();
			for(int i=0;i<x.length();i++) {
				 letter = x.charAt(i);
		           if(vowelSet.contains(letter))
		           {
		               count++;
		           }
		       
			}
			}
		
		return count;
	}
}