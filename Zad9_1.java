package Zad;
import java.util.Scanner;
public class Zad9_1 {
	public static void main(String args[]) {
		int a,b;
		a=(int)(Math.random()*6)+1;
		b=(int)(Math.random()*6)+1;
		roll(a, b);
	}
	public static void roll(int x, int y){
		System.out.println("You rolled "+x+" + "+y+" = "+(x+y));
		switch(x+y) {
		case 2:
		case 3:
		case 12:
			System.out.println("You lose");break;
		case 7:
		case 11:
			System.out.println("You win");break;
		default: 
			System.out.println("point is "+(x+y));
			int point = (x+y);
			x=0;
			y=0;
			while((x+y)!=point && (x+y)!=7) {
				x=(int)(Math.random()*6)+1;	
				y=(int)(Math.random()*6)+1;
				System.out.println("You rolled "+x+" + "+y+" = "+(x+y));
				if((x+y)==point) {System.out.println("You win");}
				else if((x+y)==7) {System.out.println("You lose");}
			}break;
			
		}
	}
}
