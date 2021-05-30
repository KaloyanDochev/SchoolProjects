package Recursion;

import java.util.Scanner;

public class TestGenericStack {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner s = new Scanner(System.in);
		GenericsStack<String> stack1 = new GenericsStack<>();
		for(int i=0; i<5; i++) {
			stack1.push(s.nextLine());
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(stack1.pop());
		}
}}
