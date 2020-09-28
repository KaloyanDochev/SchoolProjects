package edu.smg;

import java.util.Scanner;

public class input04 {
	  public static void main(String[] args){
	        Scanner sc = new Scanner(input04.class.getResourceAsStream("input04text.txt"));      
	        
	   
	        
	        //Edit these lines to advance the scanner
	        int x=0;
	        while(x<3){
	        sc.nextLine();
	        x++;
	        }
	        //Does this line contain "BlueBumper"?
	        System.out.println(sc.findInLine("BlueBumper"));
	        //Store the next two numbers as xPosition and yPosition
	        //Print these positions
	        
	        
	        System.out.println("X: "+ sc.nextInt()      +", Y: " +sc.nextInt()      );
	        sc.close();
	    }    
}
