package Zad;

import java.util.Scanner;

public class Z6_1 {
	
	public static void main(String[] args) {
String[] acceptableValues = {"Violet", "Blue", "Green", "Yellow", "Orange", "Red"};
double a; 
Scanner S=new Scanner(System.in); 
a=S.nextDouble();
//if(a<380) {
//	System.out.println("The entered wavelength is not a part of the visible spectrum");
//}
 if(a>380 && a<450) {
	 System.out.println("The color is " + acceptableValues[0]);
 }
 else if(a>=450 && a<495) {
	 System.out.println("The color is " + acceptableValues[1] );
 }
 else if(a>=495 && a<570) {
	 System.out.println("The color is " + acceptableValues[2]);
 }
 else if(a>=570 && a<590) {
	 System.out.println("The color is " + acceptableValues[3]);
 }
 else if(a>=590 && a<620) {
	 System.out.println("The color is " + acceptableValues[4]);
 }
 else if(a>=620 && a<750) {
	 System.out.println("The color is " + acceptableValues[5]);
 }
 else {
	System.out.println("The entered wavelength is not a part of the visible spectrum");
}
   }
}