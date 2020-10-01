package Zad;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Z6_2 {
	public static void main(String[] args) {
		String[] Planet = {"Mercury","Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun"};
		double[] Masa = {0.38, 0.91 , 0.38, 2.36, 0.92, 0.89, 1.13}; 
		String input1 = JOptionPane.showInputDialog("Weight?");
		double weight = Integer.parseInt(input1);
		String Planet_input = (String)JOptionPane.showInputDialog(null,
				"Choose a planet",
				"",
				-1,
				null,
				Planet,
				Planet[1]);
		for(int i=0; i<7; i++ ) {
			if(Planet_input == Planet[i]) {
				weight =  weight*Masa[i];
			}
		}
		
		 JOptionPane.showMessageDialog(null,
	                "Your weight on "+Planet_input + " is " + weight,
	                "",
	                -1);
	}
}
