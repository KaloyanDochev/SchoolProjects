package Zad;

import java.util.Scanner;

public class Z8_2_1 {
	public static void main(String args[]) {
		int[][] matrica = new int[5][5];
		Scanner sc = new Scanner(System.in);
		int red;
		int sum[] = new int[5];
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				matrica[i][j]=sc.nextInt();
				sum[i] += matrica[i][j];
			}
			//System.out.println();
		}
	int max = sum[0];
	int index = 0;
	for(int i=1; i<5; i++) {
	if(sum[i]>max) {max = sum[i];
	index = i;}	
	}
	
	System.out.println("Red: "+(index+1));
	}
}
