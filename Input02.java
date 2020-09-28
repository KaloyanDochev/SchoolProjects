package edu.smg;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Input02 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(Input02.class.getResourceAsStream("options.txt"));
//	        JOptionPane.showMessageDialog(null,
//	                "There's no input here, just a message",
//	                "Title",
//	                0);
//
//	        
//	        String input1 = (String)JOptionPane.showInputDialog(null,
//	                "Is this a question?",
//	                "Dialog Title",
//	                2,
//	                null,
//	                null,
//	                "Type something here.");
//	        
//	        
	        String[] acceptableValues = {(String)sc.nextInt(),(String) sc.nextInt(),(String) sc.nextInt()};
	        String input2 = (String)JOptionPane.showInputDialog(null,
	                "Frenska revoliuciq?",
	                "Quiz",
	                2,
	                null,
	                acceptableValues,
	                acceptableValues[0]);
	                
	    }
}
