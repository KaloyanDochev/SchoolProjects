package Zad;
import java.util.Scanner;
public class Z6_4 {
public static void main(String[] args) { 
	
	int bigBucket, smallBucket;
	// 5l big - 140, 15;  1l small - 30, 5;
	int width, height, length, squareMeters;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Width?");
	width = sc.nextInt();
	System.out.println("Length?");
	length = sc.nextInt();
	System.out.println("Height?");
	height = sc.nextInt();
 
	squareMeters = width*length + 2*length*height + 2*height*width;
	bigBucket = squareMeters/140;
	smallBucket = (squareMeters%140)/30 + 1;
	
	System.out.println("5-liter buckets: "+ bigBucket);
	System.out.println("1-liter buckets " + smallBucket);
}
}
