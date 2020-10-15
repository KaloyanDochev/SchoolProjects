package Zad;

import java.util.Scanner;

public class Z8_2_3 {

	public static void main(String args[]) {
		char[][] uchenici = new char[8][10];
		char[] otgovori = new char[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Key? ");
		for(int i=0; i<10; i++) {
			otgovori[i]=sc.next().charAt(0);
		}
		int[] tochki = new int[8];
		for(int i=0; i<8; i++) {
			System.out.println("Student " + (i+1) + ": ");
			for(int j=0; j<10; j++) {
				uchenici[i][j]=sc.next().charAt(0);
				if(otgovori[j]==uchenici[i][j]) {tochki[i]++;}
			}
		}
		System.out.println("Results: ");
		for(int i=0; i<8; i++) {
			System.out.println("Student " + (i+1) + ": " + tochki[i]);
		}
	}
	
}
