package Zad;

public class Z7_2 {
public static void main (String[] args) {
	
	int fee = 10000;
	int cost=0;
	
	for(int i=0; i<10; i++) {
		fee = fee*106/100;
		if(i>=6) {
			cost += fee;
		}
	}
	
	System.out.println("Fee: "+fee);
	System.out.println("Cost: "+cost);
}
}
